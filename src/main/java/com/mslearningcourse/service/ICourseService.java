package com.mslearningcourse.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.mslearningcourse.controller.tdo.CreateCourseRequestDTO;
import com.mslearningcourse.service.dto.CourseResponseDTO;
import com.mslearningcourse.service.dto.CreateCourseResponseDTO;

@Service
public interface ICourseService {
	public CreateCourseResponseDTO create(CreateCourseRequestDTO course);
	public List<CourseResponseDTO> search(UUID courseId);
}
