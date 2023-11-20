package com.springdatajpa.test.springdatajpa;

import com.springdatajpa.test.springdatajpa.model.Guardian;
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
					.guardian(Guardian.builder()
							.name("miloud")
							.email("miloud@gmail.com")
							.mobile("002211")
							.build())

					.build();
			SRepo.save(std1);
			Guardian grd=Guardian.builder()
					.name("morakib")
					.email("morakib@gmail.com")
					.mobile("119933")
					.build();

			Student  std2=Student.builder()
					.firstname("ayoub")
					.lastname("aouinti")
					.email("ayoub@gmail.com")
					.age(14)
					.guardian(grd)

					.build();
			SRepo.save(std2);
			Guardian grd2=Guardian.builder()
					.name("morakib1")
					.email("morakib1@gmail.com")
					.mobile("110000")
					.build();

			Student  std3=Student.builder()
					.firstname("abdollah")
					.lastname("aouinti")
					.email("abdollah@gmail.com")
					.age(4)
					.guardian(grd2)

					.build();
			SRepo.save(std3);


		};
	}

}
