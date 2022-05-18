package com.project.sidedish_jpa.sidedish;

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
public class SidedishEventBadge {

	@Id
	@GeneratedValue
	@Column(name = "sidedish_event_badge_id")
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "sidedish_id")
	private Sidedish sidedish;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "event_badge_id")
	private EventBadge eventBadge;

}
