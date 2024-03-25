package controller;

import entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repository.StudentRepository;

import java.util.List;

@RestController
public class StudentController {

    //localhost:8080/students
    @Autowired
    StudentRepository repo;
    @GetMapping("/students")
    public List<Student> getAllStudents() {
        List<Student> students = repo.findAll();
        return students;
    }
}