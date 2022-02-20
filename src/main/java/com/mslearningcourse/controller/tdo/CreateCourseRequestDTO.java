package com.mslearningcourse.controller.tdo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class CreateCourseRequestDTO {
	@NotNull
	@Size(min = 3)
	private String courseName;
}
