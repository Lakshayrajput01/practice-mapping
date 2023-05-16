package com.example.Mapping.Practice.repositories;

import com.example.Mapping.Practice.model.Book;
import com.example.Mapping.Practice.model.Laptop;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface ILaptopRepo extends ListCrudRepository<Laptop,Long> {
    List<Laptop> findByPriceBetween(Integer minPrice, Integer maxPrice);

    void deleteByName(String name);

    Laptop findByBrand(String brand);
}
