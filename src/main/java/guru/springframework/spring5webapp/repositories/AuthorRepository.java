package guru.springframework.spring5webapp.repositories;

<<<<<<< HEAD
import guru.springframework.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jt on 12/23/19.
=======
import guru.springframework.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jt on 5/16/17.
>>>>>>> af9c8e8... adding JPA example
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
