package org.project.librarymgmtsystem.dao;

import org.project.librarymgmtsystem.entity.Books;
import org.project.librarymgmtsystem.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class BooksDao {
    @Autowired
    private BooksRepository booksRepository;

    // Add Books
    public Books addBooks(Books books) {
        return booksRepository.save(books);
    }
    // Get all Books (Listing)
    public List<Books> getAllBooks() {
        return booksRepository.findAll();
    }
    // Get Book by id
    public Optional<Books> getBookById(Long id) {
        return booksRepository.findById(id);
    }
    // Update Book by id
    public Books updateBookById(Books books) {
        return booksRepository.save(books);
    }
    // Delete Book by id
    public boolean deleteBookById(Long id) {
        Optional<Books> recBook = getBookById(id);
        if (recBook.isPresent()) {
            booksRepository.delete(recBook.get());
            return true;
        }
        return false;
    }
}
