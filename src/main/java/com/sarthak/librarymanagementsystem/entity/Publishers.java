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
@Table(name = "publishers")
public class Publishers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name",nullable = false,unique = true,length = 50)
    private String name;
    @Column(name="book",nullable = false,length = 50,unique = false)
    private  String book;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

}
