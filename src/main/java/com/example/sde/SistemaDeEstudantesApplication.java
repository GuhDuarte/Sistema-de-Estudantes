package com.example.sde;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.sde.entity.Student;
import com.example.sde.repository.StudentRepository;

@SpringBootApplication
public class SistemaDeEstudantesApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SistemaDeEstudantesApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {

//		Student student1 = new Student("Gustavo", "Duarte", "gustavo@gmail.com");
//		studentRepository.save(student1);
//		
//		Student student2 = new Student("Ana", "Alves", "Ana@gmail.com");
//		studentRepository.save(student2);
//		
//		Student student3 = new Student("Jose", "Das Couves", "asdasa@gmail.com");
//		studentRepository.save(student3);
	}

}
