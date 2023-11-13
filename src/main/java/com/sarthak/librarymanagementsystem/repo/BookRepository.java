package com.sarthak.librarymanagementsystem.repo;

import com.sarthak.librarymanagementsystem.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
}
