package com.example.Eml2Sem5SpringCore.models;

import jakarta.persistence.*;
import lombok.Data;

import javax.naming.Name;

@Data
@Entity
@Table(name="books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String author;
    @Column(name = "publication_year", nullable = true)
    private Integer publicationYear;
}
