package com.example.demo.serviceImplementation;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.repository.StudentRepo;
import com.example.demo.studentModel.Student;
import com.example.demo.studentService.StudentService;

@Service
public class StudentServiceImplementation implements StudentService{

	StudentRepo studentRepo;
	
	
	public StudentServiceImplementation(StudentRepo studentRepo) {
		//super();
		this.studentRepo = studentRepo;
	}

	//---------------------------------------MyRemake--------------------------------------------------------------------------
	@Override public void createStudent(Student student) {
		 
	 studentRepo.save(student); 
	 
	 }
	
	@Override
	public void updateStudent(Student student) {
		
		studentRepo.save(student);
		
	}

	@Override
	public void deleteStudent(String studentId) {

		studentRepo.deleteById(studentId);
		
	}
	
	
	
	//--------------------------------------------------------------------------------------------------------------------------
	
	/*
	 * @Override public String createStudent(Student student) {
	 * 
	 * studentRepo.save(student); return "Successful created";
	 * 
	 * }
	 * 
	 * @Override public String updateStudent(Student student) {
	 * studentRepo.save(student); return "Successfully updated"; }
	 * 
	 * @Override public String deleteStudent(String studentId) {
	 * 
	 * studentRepo.deleteById(studentId);
	 * 
	 * return "Successfully deleted"; }
	 */
	
	@Override
	public Student getStudent(String studentId) {
		
		return studentRepo.findById(studentId).get();
		
		
	}

	@Override
	public List<Student> getAllStudent() {
		
		return studentRepo.findAll();
	}

}
