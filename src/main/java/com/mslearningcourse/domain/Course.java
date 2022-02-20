package com.mslearningcourse.domain;

import java.util.Date;
import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document
@Getter @Setter
public class Course {
	@Id
	private String id;
	
	private UUID courseId;
	private String courseName;
	private Boolean status;
	private Date createdOn;
	
	public Course(String courseName) {
		this.courseId = UUID.randomUUID();
		this.courseName = courseName;
		this.status = true;
		this.createdOn = new Date();
	}
}
