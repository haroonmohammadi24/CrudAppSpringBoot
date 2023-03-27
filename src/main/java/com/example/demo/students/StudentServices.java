package com.example.demo.students;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Service
public class StudentServices {
	
	
	private final StudentRepository studentrepository;
	
	@Autowired
	public StudentServices(StudentRepository studentrepository) {
		this.studentrepository=studentrepository;
	}
	
	public List<Student> getStudents(){
		return studentrepository.findAll();
	}

	
	public void addNewStudent(Student student) {
		studentrepository.save(student);
	}
	public void deleteTheStudent(Long id) {
		studentrepository.deleteById(id);
	}
	
  
    
   
}
