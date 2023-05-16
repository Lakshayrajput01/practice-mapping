package com.example.Mapping.Practice.controller;

import com.example.Mapping.Practice.model.Book;
import com.example.Mapping.Practice.model.Student;
import com.example.Mapping.Practice.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    BookService bookService;

    @PostMapping("/")
    public String addBookDetails(@RequestBody Book MyBook){
        return bookService.addBookDetails(MyBook);
    }

    @GetMapping("/all")
    public List<Book> getAllBooks(){
        return bookService.allBooks();
    }

    @DeleteMapping("/Id/{id}")
    public void deleteBooksById(@PathVariable Long id ){
        bookService.deleteBooksById(id);
    }

    @PutMapping("/byPrice/{price}/author/{author}")
    public String updatePriceBasedOnAuthor(@PathVariable Integer price,@PathVariable String author) {
        return bookService.updatePriceBasedOnAuthor(price, author);
    }
}
