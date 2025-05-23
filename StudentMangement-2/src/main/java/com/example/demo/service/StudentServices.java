package com.example.demo.service;

import com.example.demo.model.Student;

public class StudentServices {
	
	public String saveStudent(Student s)
	{
		System.out.println("student added");
		return "student added";
	}
	
	public Student getInforamtion(int rollNo)
	{
		Student s1=new Student();
		s1.setName("join");
		s1.setAddress("mumbai");
		s1.setrollNo(1122);
		return s1;
	}

	
}
