package com.sarthak.librarymanagementsystem.Controller;


import com.sarthak.librarymanagementsystem.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class CategoryController {

    @Autowired
    private CategoryService categoryService;
}
