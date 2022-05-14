package com.project.sidedish_jpa.sidedish;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Entity
@Getter
@RequiredArgsConstructor
public class Sidedish {

	@Id
	@GeneratedValue
	@Column(name = "sidedish_id")
	private Long id;

	private String name;

	private String description;

	private int price;

	private int stockQuantity;

	@OneToMany(mappedBy = "sidedish")
	private List<SidedishImage> sidedishImages = new ArrayList<>();

	@OneToMany(mappedBy = "sidedish")
	private List<SidedishCategory> sidedishCategories = new ArrayList<>();

	//이건 테이블 컬럼에서 빠져야 한다.  어떻게 해줘야 할까?
	private Long categoryId;

	@Override
	public String toString() {
		return "Sidedish{" +
			"id=" + id +
			", name='" + name + '\'' +
			", description='" + description + '\'' +
			", price=" + price +
			", stockQuantity=" + stockQuantity +
			", categoryId=" + categoryId +
			'}';
	}
}
