package com.sid.Student.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.codewithsid.blog1.exceptions.ResourceNotFoundException;
import com.sid.Student.entity.Student;
import com.sid.Student.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepository repository;
	
	public Student createStudent(Student student) {
		return this.repository.save(student);
	}
	
	public List<Student> getAllStudents(){
		return this.repository.findAll();
	}
	
	public Student updateStudent(Student student) {
		return this.repository.save(student);
		
		
	}

	@Override
	public void deleteStudent(long sid) {
		Student student =this.repository.findById(sid).orElseThrow(()-> new ResourceNotFoundException("String", "Id", sid));
		
		this.repository.delete(student);
	}

	@Override
	public Student getstudentusingId(long sid) {
		return this.repository.findById(sid).orElseThrow(()-> new ResourceNotFoundException("String", "Id", sid));
		
	}
	
	
	
	

}
