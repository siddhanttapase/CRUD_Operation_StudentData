package com.sid.Student.Service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.sid.Student.entity.Student;

public interface StudentService {

	Student createStudent(Student student);
	
	List<Student> getAllStudents();

	Student updateStudent(Student student);

	void deleteStudent(long sid);

	Student getstudentusingId(long sid);

	

	

	
	
	

}
