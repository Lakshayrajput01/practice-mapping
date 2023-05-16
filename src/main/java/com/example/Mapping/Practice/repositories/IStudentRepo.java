package com.example.Mapping.Practice.repositories;

import com.example.Mapping.Practice.model.Book;
import com.example.Mapping.Practice.model.Student;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;
import java.util.Optional;

public interface IStudentRepo extends ListCrudRepository<Student,Long> {

     Student findByPhoneNumber(String phoneNumber);
}
