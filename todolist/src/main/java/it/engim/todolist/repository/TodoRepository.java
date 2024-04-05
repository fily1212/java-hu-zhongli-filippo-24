package it.engim.todolist.repository;

import it.engim.todolist.model.Todo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TodoRepository extends CrudRepository<Todo, Integer> {
    List<Todo> findAll();
    Todo findById(int id);
}
