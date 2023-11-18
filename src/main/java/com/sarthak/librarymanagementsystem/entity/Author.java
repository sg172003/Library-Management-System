package com.sarthak.librarymanagementsystem.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name = "authors")
public class Author {
    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name",nullable = false,length = 100,unique = true)
    private String name;
    @Column(name = "description",nullable = false,length = 100,unique = true)
    private String description;
    @Column(name="book",nullable = false,length = 50,unique = false)
    private  String book;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

}
