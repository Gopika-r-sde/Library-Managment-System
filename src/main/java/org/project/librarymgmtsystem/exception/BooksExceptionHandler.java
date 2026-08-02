package org.project.librarymgmtsystem.exception;

import org.project.librarymgmtsystem.entity.ResponseStructure;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class BooksExceptionHandler {

    public ResponseEntity<ResponseStructure<String>> handleBNFE(BooksNotFoundException exception) {
        ResponseStructure<String> structure = new ResponseStructure<>();
        structure.setMessage(exception.getMessage());
        structure.setStatusCode(HttpStatus.NOT_FOUND.value());
        structure.setMessage("Books Not Found");
        return new ResponseEntity<ResponseStructure<String>>(structure, HttpStatus.NOT_FOUND);
    }
}
