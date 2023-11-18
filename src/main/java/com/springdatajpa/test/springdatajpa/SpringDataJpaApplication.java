package com.springdatajpa.test.springdatajpa;

import com.springdatajpa.test.springdatajpa.model.Student;
import com.springdatajpa.test.springdatajpa.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaApplication.class, args);
	}


	@Bean
	CommandLineRunner commandLineRunner(StudentRepository SRepo){
		return args->{
			Student std1=Student.builder()
					.firstname("mohamed")
					.lastname("aouinti")
					.email("mohamed@gmail.com")
					.age(22)
					.build();
			SRepo.save(std1);
			Student  std2=new Student("mohamed","aouinti","moh@gmail.com",33);
			SRepo.save(std2);


		};
	}

}
