package com.practice.demo.service;

import com.practice.demo.entity.Book;
import com.practice.demo.repo.BookRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    private final BookRepo bookRepo;

    public BookService(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    public List<Book> getAllList(){
        return bookRepo.findAll();
    }
    public Book createNew(Book book){
        return bookRepo.save(book);
    }
    public Book updateBook(Long id, Book book) {
        if (bookRepo.existsById(id)) {
            bookRepo.setId(id);
            return bookRepo.save(book);
        }
        return null;
    }
    public Optional<Book> listById(Long id){
        return bookRepo.findById(id);
    }
    public void delete(Long id){
        bookRepo.deleteById(id);
    }

}
