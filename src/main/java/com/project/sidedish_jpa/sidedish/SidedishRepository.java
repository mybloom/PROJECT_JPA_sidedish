package com.project.sidedish_jpa.sidedish;

import java.util.List;
import javax.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SidedishRepository {

	private final EntityManager entityManager;

	public List<Sidedish> findAllBySubCategoryId(Long categoryId) {
		String jpql = "select s "
			+ "from Sidedish s "
			+ "join s.sidedishCategories sc "
			+ "where sc.categoryId = :categoryId";

		return entityManager.createQuery(jpql, Sidedish.class)
			.setParameter("categoryId" , categoryId)
			.getResultList();
	}

	public List<Sidedish> findAll() {
		String jpql = "select s from Sidedish s";

		return entityManager.createQuery(jpql, Sidedish.class)
			.getResultList();
	}

	/**
	 * 최상위 카테고리에 속한 서브카테고리 리스트를 인자로 받아 반찬목록 조회
	 * @param categoryId
	 * @return
	 */
	public List<Sidedish> findAllBySubCategoryIds(List<Long> categoryIds) {
		String jpql = "select s "
			+ "from Sidedish s "
			+ "join s.sidedishCategories sc "
			+ "where sc.categoryId = :categoryIds";

		return entityManager.createQuery(jpql, Sidedish.class)
			.setParameter("categoryIds" , categoryIds)
			.getResultList();
	}

}
