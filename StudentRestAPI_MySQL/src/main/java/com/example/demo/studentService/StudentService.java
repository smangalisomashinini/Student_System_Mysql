package com.example.demo.studentService;

import java.util.List;

import com.example.demo.studentModel.Student;

public interface StudentService {
	
	public void createStudent(Student student);
	public void updateStudent(Student student);
	public void deleteStudent(String studentId);
	public Student getStudent(String studentId);
	public List<Student> getAllStudent();

}
