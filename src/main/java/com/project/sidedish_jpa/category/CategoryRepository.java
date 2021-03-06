package com.project.sidedish_jpa.category;

import java.util.List;
import javax.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class CategoryRepository {

	/**
	 * 엔티티매니저를 왜 의존해야 하는지 작성
	 */
	private final EntityManager entityManager;

	/**
	 * 최상위 카테고리에 대한 하위 카테고리 목록 제공
	 * <p>
	 * - 모든 쿼리 필요할 때 어떻게 해야 하는지 적어두기
	 * - JPQL의 페치 조인 사용
	 * </p>
	 */
	public List<Category> findAll() {
		String jpql = "select c from Category c join fetch c.parent";

		return entityManager.createQuery(jpql, Category.class)
			.getResultList();
	}

	/**
	 * 최상위 카테고리 id로 자식 카테고리 정보 조회
	 * @param parentCategoryId
	 * @return
	 */
	public List<Category> findSubCategoryIdByParentId(Long parentCategoryId){
		String jpql = "select distinct p "
			+ "from Category p "
			+ "join fetch p.child c "
			+ "where p.id = : parentCategoryId";

		return entityManager.createQuery(jpql, Category.class)
			.setParameter("parentCategoryId" , parentCategoryId)
			.getResultList();
	}
}
