package org.project.librarymgmtsystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Books {
    @Id
    private String id;
    private String title;
    private String author;
}
