package com.example.testProject.entity;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Setter
@Getter
@Entity
@Cacheable
@Data
@NoArgsConstructor
@AllArgsConstructor
@Cache(usage= CacheConcurrencyStrategy.READ_WRITE)
public class Student {
    @Id
    @GeneratedValue
    int id;
    String name;
    String field;
    double average;



    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", field='" + field + '\'' +
                ", average=" + average +
                '}';
    }
}
