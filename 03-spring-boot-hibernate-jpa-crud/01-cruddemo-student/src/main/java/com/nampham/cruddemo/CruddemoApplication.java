package com.nampham.cruddemo;

import com.nampham.cruddemo.dao.StudentDAO;
import com.nampham.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return runner -> {
			//createStudent(studentDAO);
			createMultipleStudent(studentDAO);
			//readStudent(studentDAO);
			//queryForStudents(studentDAO);
			//queryForStudentsByLastName(studentDAO);
			//updateStudent(studentDAO);
			//deleteStudent(studentDAO);
			//deleteAllStudent(studentDAO);
		};
	}

	private void deleteAllStudent(StudentDAO studentDAO) {
		System.out.println("Deleting all students");
		int numRowsDeleted = studentDAO.deleteAll();
		System.out.println("Deleted " + numRowsDeleted + " students");
	}

	private void deleteStudent(StudentDAO studentDAO) {
		int studentId = 3;
		System.out.println("Deleting student: " + studentId);
		Student student = studentDAO.findByID(studentId);
		System.out.println("Deleted student: " + student);
		studentDAO.delete(studentId);
	}

	private void updateStudent(StudentDAO studentDAO) {
		int studentId = 1;
		System.out.println("Student ID: " + studentId);
		Student student = studentDAO.findByID(studentId);

		System.out.println("Update stdudent");
		student.setFirstName("Scooby");

		studentDAO.update(student);

		System.out.println("Updated Student: " + student);
	}

	private void queryForStudents(StudentDAO studentDAO) {
		List<Student> theStudents = studentDAO.findAll();

		for (Student tempStudent : theStudents){
			System.out.println(tempStudent);
		}
	}

	private void queryForStudentsByLastName(StudentDAO studentDAO){
		List<Student> theStudents = studentDAO.findByLastName("Pham");

		for (Student student : theStudents){
			System.out.println(student);
		}
	}

	private void createMultipleStudent(StudentDAO studentDAO) {
		Student tempStudent1 = new Student("Paul", "Doe", "pauldoe@gmail.com");

		Student tempStudent2 = new Student("Mary", "Public", "marypublic@gmail.com");

		Student tempStudent3 = new Student("Nam", "Pham", "nampham@gmail.com");

		studentDAO.save(tempStudent1);

		studentDAO.save(tempStudent2);

		studentDAO.save(tempStudent3);
	}

	private void createStudent(StudentDAO studentDAO) {
		System.out.println("Creating neww student object");
		Student tempStudent = new Student("Paul", "Doe", "pauldoe@gmail.com");

		System.out.println("Saving the student");
		studentDAO.save(tempStudent);

		System.out.println("Saved .Generated id: " + tempStudent.getId());

	}
	private void readStudent(StudentDAO studentDAO){
		System.out.println("Creating neww student object");
		Student tempStudent = new Student("Nam", "Pham", "nampham@gmail.com");

		System.out.println("Saving the student");
		studentDAO.save(tempStudent);

		System.out.println("The id of the student: " + tempStudent.getId());

		System.out.println("Read id" + tempStudent.getId());
		Student myStudent = studentDAO.findByID(tempStudent.getId());

		System.out.println(myStudent);
	}
}
