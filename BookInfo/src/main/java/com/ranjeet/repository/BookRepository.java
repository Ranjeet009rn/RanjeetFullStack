package com.ranjeet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ranjeet.Entity.Book;

public interface BookRepository extends JpaRepository<Book,Integer>{

}
