package com.example.Mapping.Practice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    private String name;
    private Integer age;
    private String phoneNumber;
    private String branch;
    private String department;

    @Embedded
    private Address address;
}
