package com.project.sidedish_jpa.sidedish;

import java.util.List;
import javax.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SidedishRepository {

	private final EntityManager entityManager;

	public List<Sidedish> findAllByCategoryId(Long categoryId) {
		String jpql = "select s "
			+ "from Sidedish s "
			+ "join s.sidedishCategories sc "
			+ "where s.categoryId = :categoryId";

		return entityManager.createQuery(jpql, Sidedish.class)
			.setParameter("categoryId" , categoryId)
			.getResultList();
	}

	public List<Sidedish> findAll() {
		String jpql = "select s from Sidedish s";

		return entityManager.createQuery(jpql, Sidedish.class)
			.getResultList();
	}


}
