package org.project.librarymgmtsystem.controller;

import org.project.librarymgmtsystem.entity.Books;
import org.project.librarymgmtsystem.entity.ResponseStructure;
import org.project.librarymgmtsystem.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BooksController {

    @Autowired
    private BooksService booksService;

    @PostMapping("/saveBooks")
    public ResponseEntity<ResponseStructure<Books>> addBooks(@RequestBody Books books) {
        return booksService.addBooks(books);
    }

    @GetMapping("/getBooks")
    public ResponseEntity<ResponseStructure<List<Books>>> getAllBooks() {
        return booksService.getAllBooks();
    }

    @GetMapping("/book/{id}")
    public ResponseEntity<ResponseStructure<Optional<Books>>> getBookById(@PathVariable Long id) {
        return booksService.getBookById(id);
    }

    @PutMapping("/book/{id}")
    public ResponseEntity<ResponseStructure<Books>> updateBookById(@PathVariable Long id, @RequestBody Books books) {
        return booksService.updateBookById(id, books);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ResponseStructure<String>> deleteBookById(@PathVariable Long id) {
        return booksService.deleteBookById(id);
    }
}
