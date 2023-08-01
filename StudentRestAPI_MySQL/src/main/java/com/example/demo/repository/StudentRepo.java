package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.studentModel.Student;

public interface StudentRepo extends JpaRepository<Student, String> {

	
}
