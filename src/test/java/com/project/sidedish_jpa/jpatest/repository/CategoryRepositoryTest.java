package com.project.sidedish_jpa.jpatest.repository;


import com.project.sidedish_jpa.domain.Category;
import com.project.sidedish_jpa.repository.CategoryRepository;
import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
class CategoryRepositoryTest {

	@Autowired
	CategoryRepository categoryRepository;

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
		Assertions.assertThat(categoryList).hasSize(6).anyMatch(category -> category.getTitle() != null);

		//삭제 할 부분
		for (Category category : categoryList) {
			System.out.println(category.toString());
		}

	}
}