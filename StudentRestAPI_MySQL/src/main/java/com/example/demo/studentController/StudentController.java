package com.example.demo.studentController;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.studentModel.Student;
import com.example.demo.studentService.StudentService;

@RestController
@RequestMapping("student")
public class StudentController {
	  
	StudentService studentService; //Talks to service layer by instantiate 
	
	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}

	
	
	@GetMapping("{studentId}")
	public Student getStudentDetails(@PathVariable("studentId")String studentId){
		
		 return studentService.getStudent(studentId);
		
		
	}
	
	@GetMapping()
	public List<Student> getAllStudentDetails(){
		
		 return studentService.getAllStudent();
	}
	
	
	
	@PostMapping
	public String createStudentDetails(@RequestBody Student student)
	{
		//this.student = student;
		
		studentService.createStudent(student);
		
		return "Successfully created";
		
	}
	@PutMapping
	public String updateStudentDeails(@RequestBody Student student)
	{
		//this.student = student;
		
		studentService.updateStudent(student);
		
		return "Successfully updated";
	}
	
	@DeleteMapping("{studentId}")
	public String deleteStudentDetails(String studentId)
	{
		//this.student = null;
		studentService.deleteStudent(studentId);
		return "Successfully deleted";
	}
	
}
