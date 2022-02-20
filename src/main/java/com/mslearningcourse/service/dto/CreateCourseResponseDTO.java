package com.mslearningcourse.service.dto;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
@AllArgsConstructor
public class CreateCourseResponseDTO {
	private UUID courseId;
}
