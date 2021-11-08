package com.example.sde.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sde.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
	
}
