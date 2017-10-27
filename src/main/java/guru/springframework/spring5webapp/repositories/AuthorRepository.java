package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

//as the key is a Long we go Author, Long
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
