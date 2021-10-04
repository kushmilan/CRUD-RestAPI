package com.first.crudapi.services;

import java.util.List;

import com.first.crudapi.entities.Course;

public interface CourseServices {
	public List<Course> getCourses();

	public Course getCourse(String courseId);

	public List<Course> addCourse(Course course); 
}
