package com.mslearningcourse.data;

import java.util.List;
import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.mslearningcourse.domain.Course;

@Repository
public interface ICourseRepository extends MongoRepository<Course, UUID> {
	@Query(value = "{'courseName': ?0}")
	public List<Course> findByCourseName(String courseName);

	@Query(value = "{'courseId': ?0}")
	public List<Course> findByCourseId(UUID courseId);
}
