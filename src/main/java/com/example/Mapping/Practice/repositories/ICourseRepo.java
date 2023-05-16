package com.example.Mapping.Practice.repositories;

import com.example.Mapping.Practice.model.Book;
import com.example.Mapping.Practice.model.Course;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface ICourseRepo extends ListCrudRepository<Course,Long> {
    List<Course> findByTitle(String title);

    void deleteByDuration(String duration);
}
