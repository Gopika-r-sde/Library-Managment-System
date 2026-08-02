package org.project.librarymgmtsystem.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseStructure<T> {
    private String message;
    private int statusCode;
    private  T data;
}
