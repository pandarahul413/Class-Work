package com.springtest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springtest.entity.Course;
import com.springtest.service.CourseService;

@RestController
public class MyController {
	@Autowired
	private CourseService courseService;
	@GetMapping("/home")
	public String home()
	{
		return "welcome to springboot Applications";
	}
	@GetMapping("/courses")
	public List<Course>getCourse()
	{
		return this.courseService.getcourse();
		
	}
	@GetMapping("/courses/{courseId}")
	public Course getcourseByid(@PathVariable String courseId)
	{
		return this.courseService.getcourseById(Long.parseLong(courseId));
	}
}
