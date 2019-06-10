package mum.edu.cs.eLibrarySpringboot.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mum.edu.cs.eLibrarySpringboot.model.Book;
import mum.edu.cs.eLibrarySpringboot.repository.BookRepository;
import mum.edu.cs.eLibrarySpringboot.service.BookService;


@Service("bookService")
public class BookServiceImpl implements BookService {

	@Autowired
	BookRepository bookRepository;
	
	@Override
	public List<Book> findAll() {
		return bookRepository.findAll();
	}

	@Override
	public Book save(Book student) {
		return bookRepository.save(student);
	}

	@Override
	public Optional<Book> findOne(int id) {
		return bookRepository.findById(id);
	}

	@Override
	public void delete(int id) {
		bookRepository.deleteById(id);
	}

}
