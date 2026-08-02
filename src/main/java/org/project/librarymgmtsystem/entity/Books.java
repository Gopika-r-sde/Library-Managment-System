package org.project.librarymgmtsystem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String author;
    @Column(nullable = false)
    private String publisher;
    @Column(nullable = false)
    private String category;
    @Column(nullable = false)
    private String isbn;
    @Column(nullable = false)
    private Double price;
    @Column(nullable = false)
    private int totalCopies;
    @Column(nullable = false)
    private int availableCopies;
}
