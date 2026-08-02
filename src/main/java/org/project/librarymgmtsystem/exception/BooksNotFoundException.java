package org.project.librarymgmtsystem.exception;

import java.io.Serial;

public class BooksNotFoundException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;
    public BooksNotFoundException(String message) {
        super(message);
    }
}
