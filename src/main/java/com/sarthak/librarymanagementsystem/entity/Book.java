package com.sarthak.librarymanagementsystem.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "isbn",nullable = false,length = 50)
    private String isbn;
    @Column(name = "name",nullable = false,length = 50)
    private String name;
    @Column(name = "description",nullable = false,length = 100,unique = true)
    private String description;
    @Column(name = "author",length = 100,unique = false,nullable = false)
    private String Author;
    @Column(name = "publisher",length = 100,unique = false,nullable = false)
    private String Publisher;
    @Column(name = "category",length = 100,unique = false,nullable = false)
    private String Category;



    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

}