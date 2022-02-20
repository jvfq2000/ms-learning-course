package com.mslearningcourse.service.map;

import java.util.ArrayList;
import java.util.List;

import com.mslearningcourse.domain.Course;
import com.mslearningcourse.service.dto.CourseResponseDTO;

public class CourseMap {
	public static List<CourseResponseDTO> toDTO(List<Course> courses) {
		List<CourseResponseDTO> listCourseDTO = new ArrayList<>(); 
		
		for (Course course : courses) {
			listCourseDTO.add(
				new CourseResponseDTO(
					course.getCourseId(),
					course.getCourseName(),
					course.getStatus(),
					course.getCreatedOn()
				)
			);
		}
		
		return listCourseDTO;
	}
}
