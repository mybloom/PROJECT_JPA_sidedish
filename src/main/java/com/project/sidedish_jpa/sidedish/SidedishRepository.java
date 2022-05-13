package com.project.sidedish_jpa.sidedish;

import java.util.List;
import javax.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SidedishRepository {

	private final EntityManager entityManager;

	public List<Sidedish> findAllByCategoryId() {
		String jpql = "";

		return entityManager.createQuery(jpql, Sidedish.class)
			.getResultList();
	}

}
