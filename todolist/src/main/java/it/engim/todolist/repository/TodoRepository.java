package it.engim.todolist.repository;

import it.engim.todolist.model.Todo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface TodoRepository extends CrudRepository<Todo, Integer> {
    List<Todo> findAll();
    Optional<Todo> findById(int id);

}
