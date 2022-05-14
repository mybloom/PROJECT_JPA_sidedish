package com.project.sidedish_jpa.sidedish;

import javax.persistence.Column;
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
	@Column(name = "sidedish_image_id")
	private Long id;

//	private String name;

	@Column(name = "image_url")
	private String url;

	@Column(name = "image_sequence")
	private int sequence;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "sidedish_id")
	private Sidedish sidedish;
}
