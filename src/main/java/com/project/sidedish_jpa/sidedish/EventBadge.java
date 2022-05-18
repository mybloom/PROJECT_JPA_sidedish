package com.project.sidedish_jpa.sidedish;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class EventBadge {

	@Id
	@GeneratedValue
	@Column(name = "event_badge_id")
	private Long id;

	private String name;

	private BigDecimal discountRate;

	private LocalDateTime applyStartDate;

	private LocalDateTime applyEndDate;

}
