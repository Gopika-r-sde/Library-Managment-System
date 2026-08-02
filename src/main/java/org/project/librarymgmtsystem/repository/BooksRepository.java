package org.project.librarymgmtsystem.repository;

import org.project.librarymgmtsystem.entity.Books;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BooksRepository extends JpaRepository<Books, Long> {
}
