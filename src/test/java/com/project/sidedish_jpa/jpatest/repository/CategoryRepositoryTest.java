package com.project.sidedish_jpa.jpatest.repository;


import static org.assertj.core.api.Assertions.assertThat;

import com.project.sidedish_jpa.category.Category;
import com.project.sidedish_jpa.category.CategoryRepository;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.transaction.annotation.Transactional;



//@SpringBootTest(
//	webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT
//	, properties = "spring.profiles.active=testrun"
//)
//@ActiveProfiles("testrun")
//@PropertySource("classpath:application-testrun.yml")
@TestPropertySource(properties = { "spring.config.location=classpath:application-testrun.yml" })
@SpringBootTest
@Transactional
class CategoryRepositoryTest {

	private static final Logger log = LoggerFactory.getLogger(CategoryRepositoryTest.class);

	@Autowired
	CategoryRepository categoryRepository;

//	/**
//	 * setUp() 메서드는 실행되었으나 data-test.sql은 실행되지 않았다.
//	 * @Sql({"classpath:data-test.sql"}) 에 classpath 없애도 마찬가지
//	 * 그래서 테스트 실패.
//	 */
//	@BeforeEach
//	@Sql({"classpath:data-test.sql"})
//	void setUp() {
//		log.debug("***실행됨");
//	}


	/*
	 TODO
	  	 - db 조회 결과가 원하는 데이터인지를 어떻게 테스트 해봐야 할까?
	  	 - select 결과를 테스트 할 때는 given은 필요없을까?
	  	 - hasSize(6)는 데이터가 추가 되면 테스트 fail이 되는데,
	       조인 쿼리에 대해 신뢰하려면 row수를 확인해야 한다고 생각한다.
	       조인 쿼리 신뢰를 위한 테스트는 아니니깐 없어도 되는걸까?
	 */
	@Test
	@DisplayName("최상위 카테고리가 가지고 있는 서브 카테고리 목록 조회")
	@Transactional
	void selectCategoryList() {
		//given

		//when
		List<Category> categoryList = categoryRepository.findAll();

		//then
		assertThat(categoryList).hasSize(6)
			.anyMatch(category -> category.getParent().getTitle().contains("_테스트"));

		//삭제 할 부분
		for (Category category : categoryList) {
			System.out.println(category.toString());
		}
	}

	@Test
	@DisplayName("최상위 카테고리 id로 자식 카테고리 정보 조회")
	void selectSubCategoryIdByParentId() {
		//given

		//when
		List<Category> categories = categoryRepository.findSubCategoryIdByParentId(1L);

		//then
		assertThat(categories).hasSize(2)
			.anyMatch(category -> category.getChild().get(0).getParent().getId() == 1);

		for (Category category : categories) {
			System.out.println("^^^^" + category.toString());
			List<Category> child = category.getChild();
			for (Category eachChild : child) {
				System.out.println("****"+eachChild.toString());
			}
		}
	}
}