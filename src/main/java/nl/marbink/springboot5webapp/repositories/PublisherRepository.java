package nl.marbink.springboot5webapp.repositories;

import nl.marbink.springboot5webapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {


}
