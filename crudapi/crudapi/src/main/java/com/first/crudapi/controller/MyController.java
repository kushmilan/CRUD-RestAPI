package com.first.crudapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.first.crudapi.entities.Course;
import com.first.crudapi.services.CourseServices;

@RestController
public class MyController {
	
	@Autowired
	private CourseServices courseServices;
	
	@GetMapping("/home")
	public String home() {
		return "Hi All";
	}

	@GetMapping("/courses")
	public List<Course> getCourses(){		
		return courseServices.getCourses();
	}
	
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId){		
		return courseServices.getCourse(courseId);
	}
	
	@PostMapping("/courses")
	public List<Course> addCourse(@RequestBody Course course){		
		return courseServices.addCourse(course);
	}
	
	
	
}