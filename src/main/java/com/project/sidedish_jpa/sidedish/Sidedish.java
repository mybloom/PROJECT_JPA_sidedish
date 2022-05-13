package com.project.sidedish_jpa.sidedish;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
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

}
