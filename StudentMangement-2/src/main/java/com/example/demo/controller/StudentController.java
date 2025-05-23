package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentServices;
@RestController
public class StudentController {
	

	@PostMapping("student")
	String addStudent(Student s)
	{
		StudentServices s1=new StudentServices();
		s1.saveStudent(s);
		return "student add";
	}
	@GetMapping("student")
	public Student getStudent(int rollNo)
	{
		
		StudentServices services=new StudentServices();
		Student stu=services.getInforamtion(111);
		return stu;
		
		
		
	}

}
