package com.ranjeet.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ranjeet.Entity.Book;
import com.ranjeet.repository.BookRepository;

@RestController
@RequestMapping(value = "/api/v1/Book")
public class bookController {
	@Autowired

	private BookRepository bookRepository;

	@PostMapping(value = "/create")
	public Book createBook( @RequestBody Book book) {
		return bookRepository.save(book);
	}

	@GetMapping(value = "/getall")

	public List<Book> getBook() {
		return bookRepository.findAll() ;
	}

	@PutMapping(value = "/update")
	public Book updateBook( @RequestBody Book book) {
		return bookRepository.save(book);
	}

	@DeleteMapping(value = "/delete")
	public void deleteBook(int id) {
		bookRepository.deleteById(id);
	}


}
