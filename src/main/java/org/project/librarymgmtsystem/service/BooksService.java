package org.project.librarymgmtsystem.service;

import org.project.librarymgmtsystem.dao.BooksDao;
import org.project.librarymgmtsystem.entity.Books;
import org.project.librarymgmtsystem.entity.ResponseStructure;
import org.project.librarymgmtsystem.exception.BooksNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BooksService {

    @Autowired
    private BooksDao booksDao;

    // Add Book
    public ResponseEntity<ResponseStructure<Books>> addBooks(Books books) {
        ResponseStructure<Books> structure = new ResponseStructure<>();
        structure.setData(booksDao.addBooks(books));
        structure.setMessage("Books Added Successfully");
        structure.setStatusCode(HttpStatus.CREATED.value());

        return new ResponseEntity<ResponseStructure<Books>>(structure, HttpStatus.CREATED);
    }

    // Get All Books (Listing)
    public ResponseEntity<ResponseStructure<List<Books>>> getAllBooks(Books books) {
        ResponseStructure<List<Books>> structure = new ResponseStructure<>();
        List<Books> recBooks = booksDao.getAllBooks();
        if (!recBooks.isEmpty()) {
            structure.setMessage("Books Found Successfully");
            structure.setData(recBooks);
            structure.setStatusCode(HttpStatus.OK.value());

            return new ResponseEntity<ResponseStructure<List<Books>>>(structure, HttpStatus.OK);
        }
        // if no books found throw custom exception
        throw new BooksNotFoundException("No Books found in the library");
    }

    // Get By Id
    public ResponseEntity<ResponseStructure<Optional<Books>>> getBookById(Long id) {
        ResponseStructure<Optional<Books>> structure = new ResponseStructure<>();
        Optional<Books> recBook = booksDao.getBookById(id);
        if (!recBook.isEmpty()) {
            structure.setMessage("Books found by id Successfully");
            structure.setData(recBook);
            structure.setStatusCode(HttpStatus.NOT_FOUND.value());
            return new ResponseEntity<ResponseStructure<Optional<Books>>>(structure, HttpStatus.NOT_FOUND);
        }
        // if no books found with this id throw custom exception
        throw new BooksNotFoundException("No book found with this id :" + id);

    }
}
