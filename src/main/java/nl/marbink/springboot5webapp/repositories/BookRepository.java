package nl.marbink.springboot5webapp.repositories;

import nl.marbink.springboot5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
