package com.project.sidedish_jpa.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class SidedishImage {

	@Id
	@GeneratedValue
	private Long id;

	private String name;

	private String url;

	private int sequence;

	@ManyToOne
	@JoinColumn(name = "sidedish_id")
	private Sidedish sidedish;
}
