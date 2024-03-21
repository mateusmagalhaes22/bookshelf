package com.mateus.BookShelf.books;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {

	@Autowired
	private BookRepository repository;
	
	public Optional<Iterable<Book>> getAll() {
		return Optional.of(repository.findAll());
	}

	public Optional<List<Book>> getByAuthor(String author) {
		return repository.findAllByAuthor(author);
	}
	
	public Book addNewBook(String name, String author, double price) {
		Book book = new Book();
		book.setName(name);
		book.setAuthor(author);
		book.setPrice(price);
		return repository.save(book);
	}

	public Book deleteBook(int id) {
		Optional<Book> book = repository.findById(id);
		repository.deleteById(id);;
		return book.orElse(null);
	}

	
	
}
