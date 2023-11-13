package com.sarthak.librarymanagementsystem.Service;


import com.sarthak.librarymanagementsystem.entity.Publishers;
import com.sarthak.librarymanagementsystem.repo.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublisherService {

    @Autowired
    private PublisherRepository publisherRepository;

    public List<Publishers> findAllPublishers(){
        return publisherRepository.findAll();
    }

    public Publishers findPublisherById(Long id){
        Publishers publisher = publisherRepository.findById(id).orElseThrow(() -> new RuntimeException("Publisher not found"));
        return publisher;
    }

    public void cretePublisher(Publishers publisher){
        publisherRepository.save(publisher);
    }

    public void updatePublisher(Publishers publisher){
        publisherRepository.save(publisher);
    }

    public void deletePublisher(Long id){
        Publishers publisher = publisherRepository.findById(id).orElseThrow(() -> new RuntimeException("Publisher not found"));
        publisherRepository.deleteById(publisher.getId());
    }
}
