package mum.edu.cs.eLibrarySpringboot.service;

import java.util.List;
import java.util.Optional;

import mum.edu.cs.eLibrarySpringboot.model.Book;


public interface BookService {
	
		 List<Book> findAll();
		 Book save(Book student);
		 Optional<Book> findOne(int id);
		 void delete(int id);
}
