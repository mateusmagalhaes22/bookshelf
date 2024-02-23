package com.mateus.bookshelf.books;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends MongoRepository<Book, String>{

	Optional<List<Book>> findAllByAuthor(String author);
	
}
