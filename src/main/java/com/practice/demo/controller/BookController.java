package com.practice.demo.controller;

import com.practice.demo.entity.Book;
import com.practice.demo.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/book")
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/list")
    public List<Book> getAllBook() {
        return bookService.getAllList();
    }

    @PostMapping("/create")
    public Book createBook(@RequestBody Book book) {
        return bookService.createNew(book);
    }

    @GetMapping("/list/{id}")
    public Optional<Book> listById(@PathVariable Long id) {
        return bookService.listById(id);
    }

    @PutMapping("/update/{id}")
    public Book updateBook(@PathVariable Long id, @RequestBody Book book) {
        return bookService.updateBook(id, book);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteById(Long id){
        bookService.delete(id);
    }
}
