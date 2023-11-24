package com.springdatajpa.test.springdatajpa;

import com.springdatajpa.test.springdatajpa.model.Course;
import com.springdatajpa.test.springdatajpa.model.Guardian;
import com.springdatajpa.test.springdatajpa.model.Student;
import com.springdatajpa.test.springdatajpa.model.courseMaterial;
import com.springdatajpa.test.springdatajpa.repository.CourseRepository;
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
	CommandLineRunner commandLineRunner(StudentRepository SRepo, CourseRepository CRepo){
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


			Course crs1=Course.builder()
					.title("Devops for software enginners")
					.credit(30000)
					.courseMaterial(courseMaterial.builder()
							.url("http://www.DVPS1.comm").build())
					.build();
			Course crs2=Course.builder()
					.title("Blockchain for software enginners")
					.credit(20000)
					.courseMaterial(courseMaterial.builder()
							.url("http://www.DVPS2.comm").build())
					.build();
			Course crs3=Course.builder()
					.title("Cloud for software enginners")
					.credit(90000)
					.courseMaterial(courseMaterial.builder()
							.url("http://www.CLOUD3.comm").build())
					.build();

			Course crs4=Course.builder()
					.title("microservices for software enginners")
					.credit(30000)
					.courseMaterial(courseMaterial.builder()
							.url("http://www.DVPS4.comm").build())
					.build();
			Course crs5=Course.builder()
					.title("Agile for software enginners")
					.credit(30000)
					.courseMaterial(courseMaterial.builder()
							.url("http://www.DVPS5.comm").build())
					.build();
            CRepo.save(crs1);
			CRepo.save(crs2);
			CRepo.save(crs3);
			CRepo.save(crs4);
			CRepo.save(crs5);







		};
	}

}
