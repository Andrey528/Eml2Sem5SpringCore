package com.example.Eml2Sem5SpringCore.repositories;

import com.example.Eml2Sem5SpringCore.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
