package com.sarthak.librarymanagementsystem.Controller;

import com.sarthak.librarymanagementsystem.Service.AuthorService;
import com.sarthak.librarymanagementsystem.Service.BookService;
import com.sarthak.librarymanagementsystem.Service.CategoryService;
import com.sarthak.librarymanagementsystem.Service.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;
    @Autowired
    private AuthorService authorService;
    @Autowired
    private PublisherService publisherService;
    @Autowired
    private CategoryService categoryService;
}
