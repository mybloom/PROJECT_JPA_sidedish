package com.project.sidedish_jpa.sidedish;

import javax.persistence.Entity;
import javax.persistence.FetchType;
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "sidedish_id")
	private Sidedish sidedish;
}
