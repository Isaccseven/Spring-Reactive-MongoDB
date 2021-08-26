package de.luca.db.persistence;

import de.luca.db.model.Todo;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends ReactiveMongoRepository<Todo, String> {

    Todo findByName(String name);
}
