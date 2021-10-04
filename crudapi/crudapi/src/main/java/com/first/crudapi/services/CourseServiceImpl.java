package com.first.crudapi.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.first.crudapi.entities.Course;

@Service
public class CourseServiceImpl implements CourseServices{

	List<Course> list;	
	
	public CourseServiceImpl() {
		list = new ArrayList<>();
		
		list.add(new Course(145, "Java course", "Learn java for free"));
		list.add(new Course(140, "Python course", "Learn python for free"));		
	}

	@Override
	public List<Course> getCourses() {
		return this.list;
	}

	@Override
	public Course getCourse(String courseId) {
		for(Course c : list) {
			if(c.getId() == Integer.parseInt(courseId)) {
				return c;
			}
		}
		return new Course(0, "null", "null");
	}

	@Override
	public List<Course> addCourse(Course course) {
		list.add(course);
		return list;
	}

}
