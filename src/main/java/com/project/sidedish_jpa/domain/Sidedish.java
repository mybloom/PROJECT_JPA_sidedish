package com.project.sidedish_jpa.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Sidedish {

	@Id
	@GeneratedValue
	private Long id;

	private String name;

	private String description;

	private int price;

	private int stockQuantity;
}
