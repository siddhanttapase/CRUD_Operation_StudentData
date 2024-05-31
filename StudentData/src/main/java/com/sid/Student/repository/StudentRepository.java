package com.sid.Student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sid.Student.entity.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
