package com.example.demo.students;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table
public class Student {
	@Id
	@SequenceGenerator(
			name="student_sequence",
			sequenceName="student_sequence",
			allocationSize = 1
			)
	@GeneratedValue( 
			strategy = GenerationType.SEQUENCE,
			generator = "student_sequence"
	)
	private long id;
	private String name;
	private String email;
	private LocalDate dob;
	private int age;
}
