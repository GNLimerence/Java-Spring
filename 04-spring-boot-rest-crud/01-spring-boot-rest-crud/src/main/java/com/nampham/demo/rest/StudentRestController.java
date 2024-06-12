package com.nampham.demo.rest;

import com.nampham.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> students;

    //define @PostConstruct to load student data only once

    @PostConstruct
    public void loadStudents() {
        students = new ArrayList<Student>();

        students.add(new Student("Nam", "Pham"));
        students.add(new Student("John", "Doe"));
        students.add(new Student("Paul", "Rudd"));
    }


    @GetMapping("/students")
    public List<Student> getStudents() {
        return students;
    }
    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId) {

        if(studentId >= students.size() || studentId < 0) {
            throw new StudentNotFoundException("Student not found - " + studentId);
        }


        return students.get(studentId);
    }
}
