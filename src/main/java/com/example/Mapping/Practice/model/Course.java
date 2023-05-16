package com.example.Mapping.Practice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    private String title;
    private String description;
    private String duration;

    @ManyToMany
    @JoinColumn(name = "fk_course")
    List<Student> studentList;
}
