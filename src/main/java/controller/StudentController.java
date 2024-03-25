package controller;

import entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import repository.StudentRepository;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentRepository repo;
    @GetMapping("/students")
    public List<Student> getAllStudents(){
        List<Student> students = repo.findAll();
        return students;
    }

    @GetMapping("/students/{id}")
    public Student getStudent(@PathVariable int id){
        Student student  = repo.findById(id).get();

        return student;
    }

    @PostMapping("/student/add")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void createsStudent(@RequestBody Student student) {
        repo.save(student);
    }
    @PutMapping("/student/update/{id}")
    public Student updatesStudents(@PathVariable int id) {
        Student student = repo.findById(id).get();
        student.setName("poonam");
        student.setPercentage(92);
        repo.save(student);
        return student;
    }
    @DeleteMapping("/student/delete/{id}")
    public void removeStudent(@PathVariable int id) {
        Student student = repo.findById(id).get();
        repo.delete(student);
    }


}