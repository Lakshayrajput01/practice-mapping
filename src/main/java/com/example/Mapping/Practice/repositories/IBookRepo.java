package com.example.Mapping.Practice.repositories;

import com.example.Mapping.Practice.model.Book;
import com.example.Mapping.Practice.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface IBookRepo extends ListCrudRepository<Book,Long> {


    Book findByAuthor(String author);
}
