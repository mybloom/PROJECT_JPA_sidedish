package com.project.sidedish_jpa.category;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import lombok.Getter;

@Entity
@Getter
public class Category {

	@Id
	@GeneratedValue
	@Column(name = "category_id")
	private Long id;

	private String title;

	/*
		그러고보니 @Column 설정하지 않아도 자동으로 "parent_category_id"로 컬럼명 생성됨.
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "parent_category_id")
	private Category parent;

	@OneToMany(mappedBy = "parent")
	private List<Category> child = new ArrayList<>();

	//기획전은 현재 스크럼에서 스펙아웃
//	private boolean isExhibition ;

	/*@OneToMany(mappedBy = "category")
	private List<CategorySidedish> categorySidedishes = new ArrayList<>();*/

	@Override
	public String toString() {
		return "Category{" +
			"id=" + id +
			", title='" + title + '\'' +
			", parent=" + parent +
			'}';
	}
}
