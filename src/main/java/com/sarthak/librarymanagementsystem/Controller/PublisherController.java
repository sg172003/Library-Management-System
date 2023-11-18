package com.sarthak.librarymanagementsystem.Controller;

import com.sarthak.librarymanagementsystem.Service.PublisherService;
import com.sarthak.librarymanagementsystem.entity.Category;
import com.sarthak.librarymanagementsystem.entity.Publishers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PublisherController {

    @Autowired
    private PublisherService publisherService;

    @GetMapping("/publishers")
    public ResponseEntity<List<Publishers>> getAllPublishers() {
        List<Publishers> publishers  =publisherService.findAllPublishers();
        return new ResponseEntity<>(publishers, HttpStatus.OK);
    }


    @GetMapping("/publisher/{id}")
    public ResponseEntity<Publishers> getPublisherById(@PathVariable Long id) {
        Publishers publishers = publisherService.findPublisherById(id);
        return new ResponseEntity<>(publishers, HttpStatus.OK);
    }

    @PostMapping("/save-publisher")
    public ResponseEntity<String> addPublisher(@RequestBody Publishers publishers) {
        publisherService.cretePublisher(publishers);
        return new ResponseEntity<>("Publisher added successfully", HttpStatus.CREATED);
    }

    @GetMapping("update-publisher/{id}")
    public ResponseEntity<String> updatePublisher(@PathVariable Long id, @RequestBody Publishers publishers) {
        publishers.setId(id);
        publisherService.updatePublisher(publishers);
        return new ResponseEntity<>("Publisher updated successfully", HttpStatus.OK);
    }

    @GetMapping("/remove-publisher/{id}")
    public ResponseEntity<String> deletePublisher(@PathVariable Long id) {
        publisherService.deletePublisher(id);
        return new ResponseEntity<>("Publisher deleted successfully", HttpStatus.OK);
    }

}
