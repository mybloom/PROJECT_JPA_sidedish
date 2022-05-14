package com.project.sidedish_jpa.sidedish;

import com.project.sidedish_jpa.basedomain.BaseCreateModify;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Getter;

@Entity
@Getter
public class SidedishCategory extends BaseCreateModify {

	@Id
	@GeneratedValue
	@Column(name = "sidedish_category_id")
	private Long id;

//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "category_id")
//	private Category category;

	private Long categoryId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "sidedish_id")
	private Sidedish sidedish;

	@Override
	public String toString() {
		return "SidedishCategory{" +
			"id=" + id +
			", categoryId=" + categoryId +
			", sidedish=" + sidedish +
			'}';
	}
}
