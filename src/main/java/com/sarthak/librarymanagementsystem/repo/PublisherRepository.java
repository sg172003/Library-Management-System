package com.sarthak.librarymanagementsystem.repo;

import com.sarthak.librarymanagementsystem.entity.Publishers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publishers,Long> {
}
