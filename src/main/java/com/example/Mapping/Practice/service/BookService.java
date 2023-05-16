package com.example.Mapping.Practice.service;

import com.example.Mapping.Practice.model.Book;
import com.example.Mapping.Practice.model.Student;
import com.example.Mapping.Practice.repositories.IBookRepo;
import com.example.Mapping.Practice.repositories.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    IBookRepo iBookRepo;

    @Autowired
    IStudentRepo iStudentRepo;


    public String addBookDetails(Book myBook) {
        Book add=iBookRepo.save(myBook);
        if(add!=null){
            return "Added SuccessFully..";
        }
        return "Details Can't be Null..!!";
    }

    public List<Book> allBooks() {
        return iBookRepo.findAll();
    }

    public void deleteBooksById(Long id) {
        iBookRepo.deleteById(id);
    }

    public String updatePriceBasedOnAuthor(Integer price, String author) {
        Book book =  iBookRepo.findByAuthor(author);

        if(book == null){
            return "Book not available now.";
        }
        book.setPrice(price);
        iBookRepo.save(book);
        return "updated price for "+author;
    }
}
