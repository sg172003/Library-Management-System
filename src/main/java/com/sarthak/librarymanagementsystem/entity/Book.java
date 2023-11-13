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


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name = "books_author",
      joinColumns =    {@JoinColumn(name = "book_id")},
    inverseJoinColumns= {@JoinColumn(name = "author_id")})
    private Set<Author> authors=new HashSet<Author>();

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name = "books_category",
            joinColumns =    {@JoinColumn(name = "book_id")},
            inverseJoinColumns= {@JoinColumn(name = "category_id")})
    private Set<Category> categories=new HashSet<Category>();

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name = "books_publishers",
            joinColumns =    {@JoinColumn(name = "book_id")},
            inverseJoinColumns= {@JoinColumn(name = "publisher_id")})
    private Set<Publishers> publishers=new HashSet<Publishers>();

    public  void removePublisher(Publishers publishers){
        this.publishers.remove(publishers);
        publishers.getBooks().remove(publishers);
    }

    public void addPublisher(Publishers publishers){
        this.publishers.add(publishers);
        publishers.getBooks().add(this);
    }

    public  void removeAuthor(Author author){
        this.authors.remove(author);
        author.getBooks().remove(author);
    }

    public void addAuthor(Author author){
        this.authors.add(author);
        author.getBooks().add(this);
    }
    public  void removeCategory(Category category){
        this.categories.remove(category);
        category.getBooks().remove(category);
    }

    public void addCategory(Category category){
        this.categories.add(category);
        category.getBooks().add(this);
    }
}