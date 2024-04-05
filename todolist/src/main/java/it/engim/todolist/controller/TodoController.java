package it.engim.todolist.controller;

import it.engim.todolist.model.Todo;
import it.engim.todolist.payload.TodoAddRequest;
import it.engim.todolist.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController("/todo")
public class TodoController {

    @Autowired
    TodoRepository todoRepository;

    @PostMapping( "/add")
    public String addTodo(@RequestBody TodoAddRequest todoRequest){
        Todo todo = new Todo();
        todo.setTitolo(todoRequest.getTitolo());
        todo.setDataScadenza(todoRequest.getDataScadenza());
        if(todoRequest.getPriorita().equals("A"))
            todo.setPriorita(Todo.Priorita.ALTA);
        else if(todoRequest.getPriorita().equals("B"))
            todo.setPriorita(Todo.Priorita.BASSA);
        else
            todo.setPriorita(Todo.Priorita.NORMALE);
        todo.setCompletato(false);
        todo.setDataInserimento(new Date());
        todoRepository.save(todo);
        return "OK";
    }
    @GetMapping("/all")
    public List<Todo> allTodo(){
        return todoRepository.findAll();
    }
}
