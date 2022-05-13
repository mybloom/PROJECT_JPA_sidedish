package com.project.sidedish_jpa.sidedish;

import com.project.sidedish_jpa.basedomain.BaseCreateModify;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class SidedishCategory extends BaseCreateModify {

	@Id
	@GeneratedValue
	private Long id;

//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "category_id")
//	private Category category;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "sidedish_id")
	private Sidedish sidedish;

	//이거 써보기 정상혁 우아한 crud 40분 경
	//참조타입을 알수있도록 아이디어 주는 것
//	private Association<Category> categoryId;
}
