package com.example.demo.students;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
	 Optional<Student> findStudentByEmail(String email);

	 //The life of software Engineer

}
