package nl.marbink.springboot5webapp.repositories;

import nl.marbink.springboot5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {


}
