package com.sid.Student.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sid.Student.Service.StudentService;
import com.sid.Student.entity.Student;

@RestController
@RequestMapping("/api/students")
public class StudentController {
	@Autowired
	private StudentService service;
	@PostMapping("/")
	public ResponseEntity<Student> createStudent(@RequestBody Student student){
		Student student1=this.service.createStudent(student);
		return new ResponseEntity<Student>(student1, HttpStatus.CREATED)  ;
		
	}
	@GetMapping("/")
	public ResponseEntity<List<Student>> getAllStudents(){
		List<Student> allStudents = this.service.getAllStudents();
		return new ResponseEntity<List<Student>>(allStudents, HttpStatus.OK);
		
	}
	@PutMapping("/{studentID}")
	public ResponseEntity<Student> updateStudent(@RequestBody Student student,@PathVariable long studentID){
		student.setSId(studentID);
		return new ResponseEntity<Student>(this.service.updateStudent(student), HttpStatus.OK);
	
		
	}
	@DeleteMapping("/{sid}")
	public void deleteStudent(@PathVariable long sid) {
		this.service.deleteStudent(sid);
		
	}
	@GetMapping("/{sid}")
	public ResponseEntity<Student> getStudentbyId(@PathVariable long sid){
		Student sid1=this.service.getstudentusingId(sid);
		return new ResponseEntity<Student>(sid1, HttpStatus.OK);
		
	}

}
