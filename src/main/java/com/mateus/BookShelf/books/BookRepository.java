package com.mateus.BookShelf.books;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer>{

	Optional<List<Book>> findAllByAuthor(String author);
	
}
