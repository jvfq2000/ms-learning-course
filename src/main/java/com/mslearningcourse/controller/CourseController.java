package com.mslearningcourse.controller;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mslearningcourse.controller.tdo.CreateCourseRequestDTO;
import com.mslearningcourse.service.ICourseService;
import com.mslearningcourse.service.dto.CourseResponseDTO;
import com.mslearningcourse.service.dto.CreateCourseResponseDTO;

@RestController
@RequestMapping("/v1/course")
public class CourseController {
	@Autowired
	private ICourseService courseService;
	
	@PostMapping
	public ResponseEntity<CreateCourseResponseDTO> create(@Valid @RequestBody CreateCourseRequestDTO course) {
		return ResponseEntity
			.status(HttpStatus.CREATED)
			.body(this.courseService.create(course));
	}

	@GetMapping
	public ResponseEntity<List<CourseResponseDTO>> search(@RequestParam(required = false) UUID courseId) {
		return ResponseEntity
			.status(HttpStatus.OK)
			.body(this.courseService.search(courseId));
	}
}
