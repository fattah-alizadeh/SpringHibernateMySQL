package com.example.testProject.repository;

import com.example.testProject.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository <Student, Integer> {
    Student findByName(String name);
}
