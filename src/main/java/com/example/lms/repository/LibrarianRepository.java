package com.example.lms.repository;

import com.example.lms.model.Librarian;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface LibrarianRepository extends JpaRepository<Librarian,Integer> {
}
