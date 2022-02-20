package com.mslearningcourse.service.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.mslearningcourse.controller.tdo.CreateCourseRequestDTO;
import com.mslearningcourse.data.ICourseRepository;
import com.mslearningcourse.domain.Course;
import com.mslearningcourse.service.ICourseService;
import com.mslearningcourse.service.dto.CourseResponseDTO;
import com.mslearningcourse.service.dto.CreateCourseResponseDTO;
import com.mslearningcourse.service.map.CourseMap;

@Service
public class CourseService implements ICourseService {
	@Autowired
	private ICourseRepository courseRepository;
	
	@Override
	public CreateCourseResponseDTO create(CreateCourseRequestDTO course) {
		List<Course> courseAlreadyExists = this.courseRepository.findByCourseName(
			course.getCourseName()
		);
		
		if (courseAlreadyExists.size() > 0) {
			throw new EmptyResultDataAccessException(1);
		}
		
		Course courseCreated = this.courseRepository.save(
			new Course(course.getCourseName())
		);
		
		return new CreateCourseResponseDTO(courseCreated.getCourseId());
	}

	@Override
	public List<CourseResponseDTO> search(UUID courseId) {
		List<Course> courses = new ArrayList<>();

		if (courseId == null) {
			courses =  this.courseRepository.findAll();
		} else {
			courses =  this.courseRepository.findByCourseId(courseId);
		}
		
		return CourseMap.toDTO(courses);
	}
}
