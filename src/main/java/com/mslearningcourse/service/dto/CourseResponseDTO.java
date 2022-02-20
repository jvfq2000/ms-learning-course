package com.mslearningcourse.service.dto;

import java.util.Date;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
@AllArgsConstructor
public class CourseResponseDTO {
	private UUID courseId;
	private String courseName;
	private Boolean status;
	private Date createdOn;
}
