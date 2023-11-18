package com.sarthak.librarymanagementsystem.Controller;

import com.sarthak.librarymanagementsystem.Service.AuthorService;
import com.sarthak.librarymanagementsystem.entity.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AuthorController {

    @Autowired
    private AuthorService authorService;


    @GetMapping("/authors")
    public ResponseEntity<List<Author>> getAllAuthors() {
        List<Author> authors = authorService.findAllAuthors();
        return new ResponseEntity<>(authors, HttpStatus.OK);
    }


    @GetMapping("/author/{id}")
    public ResponseEntity<Author> getAuthorById(@PathVariable Long id) {
        Author author = authorService.findAuthorById(id);
        return new ResponseEntity<>(author, HttpStatus.OK);
    }

    @PostMapping("/save-author")
    public ResponseEntity<String> addAuthor(@RequestBody Author author) {
        authorService.createAuthor(author);
        return new ResponseEntity<>("Author added successfully", HttpStatus.CREATED);
    }

    @GetMapping("update-author/{id}")
    public ResponseEntity<String> updateAuthor(@PathVariable Long id, @RequestBody Author author) {
        author.setId(id);
        authorService.updateAuthor(author);
        return new ResponseEntity<>("Author updated successfully", HttpStatus.OK);
    }

    @GetMapping("/remove-author/{id}")
    public ResponseEntity<String> deleteAuthor(@PathVariable Long id) {
        authorService.deleteAuthor(id);
        return new ResponseEntity<>("Author deleted successfully", HttpStatus.OK);
    }

}
