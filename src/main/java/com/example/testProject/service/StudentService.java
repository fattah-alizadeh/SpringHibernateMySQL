package com.example.testProject.service;

import com.example.testProject.entity.Student;
import com.example.testProject.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> saveStudents(List<Student> students) {
        return studentRepository.saveAll(students);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentById(int id) {
        return studentRepository.findById(id).orElse(null);
    }

    public Student getStudentByName(String name) {
        return studentRepository.findByName(name);
    }

    //Delete
    public String deleteStudentById(int id) {
        studentRepository.deleteById(id);
        return "String Deleted!!!" +id;
    }

    //Update
    public Student updateStudent(Student student) {
        Integer id = student.getId();
        Student existingStudent = studentRepository.findById(student.getId()).orElse(null);
        existingStudent.setAverage(student.getAverage());
        existingStudent.setName(student.getName());
        existingStudent.setField(student.getField());

        return  studentRepository.save(existingStudent);
    }

}
