package com.project.sidedish_jpa.domain;

import java.time.LocalDateTime;
import javax.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@Getter
@Setter
public class BaseCreateModify {

	private LocalDateTime createdDate;
	private String createdBy;

	private LocalDateTime modifiedDate;
	private String modifiedBy;
}
