package mum.edu.cs.eLibrarySpringboot.repository;

import mum.edu.cs.eLibrarySpringboot.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("bookRepository")
public interface BookRepository extends JpaRepository<Book, Integer> {

}
