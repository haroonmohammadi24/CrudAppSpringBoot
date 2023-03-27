package com.example.demo.students;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="api/v1/student")

public class StudentController {
	private StudentServices studentservices;
	@Autowired
	public StudentController(StudentServices studentservices) {
		this.studentservices= studentservices;
	}
   @GetMapping
	public List<Student> getStudents(){
		return studentservices.getStudents();
	}
   
   @PostMapping
   public void registerNewStudent(@RequestBody Student student) {
	   studentservices.addNewStudent(student);
   }
}
