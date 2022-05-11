package com.project.sidedish_jpa.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class CategorySidedish extends BaseCreateModify{

	@Id
	@GeneratedValue
	private Long id;

	@ManyToOne
	@JoinColumn(name = "category_id")
	private Category category;

	@ManyToOne
	@JoinColumn(name = "sidedish_id")
	private Sidedish sidedish;

}
