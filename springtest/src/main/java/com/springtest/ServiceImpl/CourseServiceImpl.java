package com.springtest.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springtest.entity.Course;
import com.springtest.service.CourseService;
@Service
public class CourseServiceImpl implements CourseService{

	List<Course> list;
	public CourseServiceImpl()
	{
		list=new ArrayList<>();
		list.add(new Course(145,"Java","Java Full stack"));
		list.add(new Course(123,"React Js","For front end development"));
	}
	@Override
	public List<Course> getcourse() {
		// TODO Auto-generated method stub
		return list;
	}
	@Override
	public Course getcourseById(long courseId) {
		Course c=null;
		for(Course course:list)
			if(course.getId()==courseId)
			{
				c=course;
				break;
			}
		return c;
	}

}
