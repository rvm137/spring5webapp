package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

//created by rvm for book entity 4.2.2025

public interface BookRepository extends CrudRepository<Book, Long> {
}
