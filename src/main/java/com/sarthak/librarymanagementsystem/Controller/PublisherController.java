package com.sarthak.librarymanagementsystem.Controller;

import com.sarthak.librarymanagementsystem.Service.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PublisherController {

    @Autowired
    private PublisherService publisherService;
}
