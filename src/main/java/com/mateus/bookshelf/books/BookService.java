package com.mateus.bookshelf.books;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class BookService {
	
	@Autowired
	private BookController controller;

	@GetMapping(path = "books")
	public Optional<List<Book>> getAllBooks(){
		return controller.getAll();
	}
	
	@GetMapping(path = "/{author}")
	public Optional<List<Book>> getBooksByAuthor(@PathVariable String author){
		return controller.getByAuthor(author);
	}
	
}
