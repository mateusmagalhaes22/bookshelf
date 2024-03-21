package com.mateus.BookShelf.books;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
@RequestMapping(path = "books")
public class BookService {
	
	@Autowired
	private BookController controller;

	@GetMapping()
	public Optional<Iterable<Book>> getAllBooks(){
		return controller.getAll();
	}
	
	@PostMapping()
	public Book createNewBook(@RequestBody String name, @RequestBody String author, @RequestBody double price){
		return controller.addNewBook(name, author, price);
	}
	
	@DeleteMapping(path = "/{id}")
	public Book deleteBook(@PathVariable int id) {
		return controller.deleteBook(id);
	}
	
}
