package com.springtest.service;

import java.util.List;

import com.springtest.entity.Course;

public interface CourseService {
	public List<Course>getcourse();
	public Course getcourseById(long courseId);

}
