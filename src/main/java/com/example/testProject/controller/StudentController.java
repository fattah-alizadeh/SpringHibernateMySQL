package com.example.testProject.controller;

import com.example.testProject.entity.Student;
import com.example.testProject.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private  StudentService service;

    @PostMapping("/addStudent")
    public Student addStudent (@RequestBody Student student){
        return service.saveStudent(student);

    }

    @PostMapping("/addStudents")
    public List<Student> addStudents(@RequestBody List<Student> students){
        return service.saveStudents(students);
    }

    @GetMapping("/allStudents")
    public List<Student> findAllStudent(){
        return service.getAllStudents();
    }

    @GetMapping("/studentById/{id}")
    public Student findStudentById(@PathVariable int id){
        return service.getStudentById(id);
    }
    @GetMapping("/studentByName/{name}")
    public Student findStudentById(@PathVariable String name){
        return service.getStudentByName(name);
    }

    @PutMapping("/update")
    public Student editStudent (@RequestBody Student student){
        return service.updateStudent(student);
    }

    @DeleteMapping("delete/{id}")
    public String deleteStudent (@PathVariable int id){
        return service.deleteStudentById(id);
    }
}
