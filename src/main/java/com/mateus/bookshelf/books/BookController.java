package com.mateus.bookshelf.books;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {

	@Autowired
	private BookRepository repository;
	
	public Optional<List<Book>> getAll() {
		// TODO Auto-generated method stub
		return Optional.of(repository.findAll());
	}

	public Optional<List<Book>> getByAuthor(String author) {
		// TODO Auto-generated method stub
		return repository.findAllByAuthor(author);
	}

	
	
}
