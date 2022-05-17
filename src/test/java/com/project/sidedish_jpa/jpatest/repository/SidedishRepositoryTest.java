package com.project.sidedish_jpa.jpatest.repository;

import static org.assertj.core.api.Assertions.assertThat;

import com.project.sidedish_jpa.category.Category;
import com.project.sidedish_jpa.category.CategoryRepository;
import com.project.sidedish_jpa.sidedish.Sidedish;
import com.project.sidedish_jpa.sidedish.SidedishRepository;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.transaction.annotation.Transactional;

/**
 * 매번 클래스에 아래 애노테이션이 있어야 할까?
 */
@TestPropertySource(properties = {"spring.config.location=classpath:application-testrun.yml"})
@SpringBootTest
@Transactional
class SidedishRepositoryTest {

	@Autowired
	SidedishRepository sidedishRepository;

	@Autowired
	CategoryRepository categoryRepository;

	/**
	 * 발생쿼리
	 * <p>
	 *     - 클래스 연관관계에서 Lazy로딩을 해서 sidedish와 sidedish_category가 join을 하지 않은 것이라 생각. 정리해두기
	 *     
	 *     - 1번째 쿼리 : sidedish table 조회 - findAll()로 조건없이 모두 조회
	 *         select
	 *         sidedish0_.sidedish_id as sidedish1_1_,
	 *         sidedish0_.category_id as category2_1_,
	 *         sidedish0_.description as descript3_1_,
	 *         sidedish0_.name as name4_1_,
	 *         sidedish0_.price as price5_1_,
	 *         sidedish0_.stock_quantity as stock_qu6_1_ 
	 *     from
	 *         sidedish sidedish0_
	 * 
	 *     - 2번째 쿼리: sidedish_category 중간테이블 조회 - lazy로딩 객체 크래프 탐색으로 생성된 쿼리
	 *         select
	 *         sidedishca0_.sidedish_id as sidedish7_2_0_,
	 *         sidedishca0_.sidedish_category_id as sidedish1_2_0_,
	 *         sidedishca0_.sidedish_category_id as sidedish1_2_1_,
	 *         sidedishca0_.created_by as created_2_2_1_,
	 *         sidedishca0_.created_date as created_3_2_1_,
	 *         sidedishca0_.modified_by as modified4_2_1_,
	 *         sidedishca0_.modified_date as modified5_2_1_,
	 *         sidedishca0_.category_id as category6_2_1_,
	 *         sidedishca0_.sidedish_id as sidedish7_2_1_ 
	 *     from
	 *         sidedish_category sidedishca0_ 
	 *     where
	 *         sidedishca0_.sidedish_id=?
	 * </p>
	 */
	@Test
	@DisplayName("SidedishCategory 테이블 전체내용 조회_SidedishCategory 엔티티 객체 그래프 탐색이 잘되는 지 확인하기 위한")
	void selectSidedishCategoryAll() {
		//given

		//when
		List<Sidedish> sidedishes = sidedishRepository.findAll();

		//then
		assertThat(sidedishes).hasSize(19)
			.anyMatch(sidedish -> sidedish.getSidedishCategories().get(0).getCategoryId() != null);

//		for (Sidedish sidedish : sidedishes) {
//			System.out.println("^^^^" + sidedish.toString());
//			List<SidedishCategory> sidedishCategories = sidedish.getSidedishCategories();
//			for (SidedishCategory sidedishCategory : sidedishCategories) {
//				System.out.println("****"+ sidedishCategory.toString());
//			}
//		}
	}

	/**
	 * 발생쿼리 와 특이한 점 : N+1 쿼리 발생 
	 * <p>
	 * 	- findAllBySubCategoryId은 조인쿼리인데 객체 그래프 탐색을 하면 해당 테이블에서 select를 N번 더 한다.
	 * 	- 이유는 이미 알고 있지만 해결방법이 궁금하다. 아니면 원래 이렇게 써야 하는 것인지
	 * 	쿼리를 수행하면 SidedishCategory의 category_id가 있기 때문에 바로 확인할 수 있으나
	 * 	객체에는 sidedishCategories의 get(index)를 통해서 categoryId를 가져와야 한다.
	 * 	이 과정에서 다시 한번 SidedishCategory 를 select하는 과정이 이루어지는데, 그게 왜 되야만 하는지 모르겠다.
	 * 	- join으로 연관객체의 데이터까지 한방 쿼리를 사용할 때는 lazy로딩도 즉시로딩이 되어야 하는것 아닌가?
	 * 	이 부분은 다시 찾아보자.
	 *
	 * 	- sidedishRepository.findAllBySubCategoryId(4L) 수행 쿼리(join)
	 * 	    select
	 *         sidedish0_.sidedish_id as sidedish1_1_,
	 *         sidedish0_.category_id as category2_1_,
	 *         sidedish0_.description as descript3_1_,
	 *         sidedish0_.name as name4_1_,
	 *         sidedish0_.price as price5_1_,
	 *         sidedish0_.stock_quantity as stock_qu6_1_
	 *     from
	 *         sidedish sidedish0_
	 *     inner join
	 *         sidedish_category sidedishca1_
	 *             on sidedish0_.sidedish_id=sidedishca1_.sidedish_id
	 *     where
	 *         sidedishca1_.category_id=?
	 *
	 * 	- sidedish.getSidedishCategories().get(0) 시 수행쿼리
	 * 	    select
	 *         sidedishca0_.sidedish_id as sidedish7_2_0_,
	 *         sidedishca0_.sidedish_category_id as sidedish1_2_0_,
	 *         sidedishca0_.sidedish_category_id as sidedish1_2_1_,
	 *         sidedishca0_.created_by as created_2_2_1_,
	 *         sidedishca0_.created_date as created_3_2_1_,
	 *         sidedishca0_.modified_by as modified4_2_1_,
	 *         sidedishca0_.modified_date as modified5_2_1_,
	 *         sidedishca0_.category_id as category6_2_1_,
	 *         sidedishca0_.sidedish_id as sidedish7_2_1_
	 *     from
	 *         sidedish_category sidedishca0_
	 *     where
	 *         sidedishca0_.sidedish_id=?
	 * </p>
	 */
	@Test
	@DisplayName("선택한 하위 카테고리에 대한 반찬목록 조회")
	void selectSidedishListBySubCategoryId() {
		//given

		//when
		List<Sidedish> findSidedishes = sidedishRepository.findAllBySubCategoryId(4L);

		//then
		assertThat(findSidedishes).hasSize(4)
			.anyMatch(sidedish -> sidedish.getSidedishCategories().get(0).getCategoryId() == 4);

		for (Sidedish findSidedish : findSidedishes) {
			System.out.println(findSidedish.toString());
		}
	}

	@Test
	@DisplayName("최상위 카테고리에 속한 서브카테고리 리스트를 인자로 받아 반찬목록 조회")
	void findAllBySubCategoryIds() {
		//given
		List<Category> subCategories = categoryRepository.findSubCategoryIdByParentId(1L);

		List<Long> childIds = new ArrayList<>();
		for (Category category : subCategories) {
			List<Category> children = category.getChild();

			for (Category child : children) {
				childIds.add(child.getId());
			}
		}

		//when
		List<Sidedish> sidedishes = sidedishRepository.findAllBySubCategoryIds(childIds);

		//then
		assertThat(sidedishes).hasSize(6)
			.allMatch(sidedish -> sidedish.getSidedishCategories().get(0).getId() != null);
	}
}