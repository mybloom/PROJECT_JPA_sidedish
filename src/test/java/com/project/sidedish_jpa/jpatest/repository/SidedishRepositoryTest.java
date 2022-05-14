package com.project.sidedish_jpa.jpatest.repository;

import static org.assertj.core.api.Assertions.assertThat;

import com.project.sidedish_jpa.sidedish.Sidedish;
import com.project.sidedish_jpa.sidedish.SidedishCategory;
import com.project.sidedish_jpa.sidedish.SidedishRepository;
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
	@DisplayName("SidedishCategory 테이블 전체내용 조회")
	void selectSidedishCategoryAll() {
		//given

		//when
		List<Sidedish> sidedishes = sidedishRepository.findAll();

		//then
		assertThat(sidedishes).hasSize(4)
			.anyMatch(sidedish -> sidedish.getSidedishCategories().get(0).getCategoryId() != null);

		for (Sidedish sidedish : sidedishes) {
			System.out.println("^^^^" + sidedish.toString());
			List<SidedishCategory> sidedishCategories = sidedish.getSidedishCategories();
			for (SidedishCategory sidedishCategory : sidedishCategories) {
				System.out.println("****"+ sidedishCategory.toString());
			}
		}
	}

//	@Test
//	@DisplayName("선택한 하위 카테고리에 대한 반찬목록 조회")
//	void selectSidedishListBySubCategoryId() {
//		//given
//
//		//when
//		List<Sidedish> findSidedishes = sidedishRepository.findAllByCategoryId(4L);
//
//		//then
//		assertThat(findSidedishes).hasSize(4)
//			.anyMatch(sidedish -> sidedish.getCategoryId() == 4);
////			.anyMatch(sidedish -> sidedish.getSidedishCategories().get(0).get);
//
//		for (Sidedish findSidedish : findSidedishes) {
//			System.out.println(findSidedish.toString());
//		}
//	}


}