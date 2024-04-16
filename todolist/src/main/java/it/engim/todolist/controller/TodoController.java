package it.engim.todolist.controller;

import it.engim.todolist.model.Todo;
import it.engim.todolist.payload.TodoAddRequest;
import it.engim.todolist.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class TodoController {

    @Autowired
    TodoRepository todoRepository;

    @PostMapping( "/todo/add")
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
    @GetMapping("/todo/all")
    public List<Todo> allTodo(){
        return todoRepository.findAll();
    }

    @GetMapping("/todo/alta")
    public List<Todo> prioritaAltaTodo(){
        List<Todo> list = todoRepository.findAll();
        List<Todo> listAlta = new ArrayList<>();
        for(Todo t : list){
            if(t.getPriorita().equals(Todo.Priorita.ALTA))
                listAlta.add(t);
//    condizione per controllare se una data è prima di oggi
//            if(t.getDataScadenza().compareTo(new Date()) < 0)
        }
        //
       // List<Todo> listAlta2 = list.stream().filter(todo -> todo.getPriorita().equals(Todo.Priorita.ALTA)).toList();
        list.stream().sorted(Comparator.comparing(Todo::getDataScadenza).thenComparing(Todo::getPriorita)).toList();
        return listAlta;
    }


    @GetMapping("/todo/completed/{id}")
    public String setCompleted(@PathVariable String id) {
        Optional<Todo> todoOp = todoRepository.findById(Integer.parseInt(id));
        Todo todo;
        if(todoOp.isPresent()) {
            todo = todoOp.get();
            todo.setCompletato(true);
            todoRepository.save(todo);
        }
        // Metodo + elegante:
//        Todo todo2 = todoRepository.findById(Integer.parseInt(id)).orElseThrow();
//         todo2.setCompletato(true);
//        todoRepository.save(todo2);
        return "OK";
    }

    @GetMapping("/todo/uncompleted/{id}")
    public String setUncompleted(@PathVariable String id) {
        Todo todo = todoRepository.findById(Integer.parseInt(id)).orElseThrow();
        todo.setCompletato(true);
        todoRepository.save(todo);
        return "OK";
    }


    @GetMapping("/todo/remove/{id}")
    public String removeTodo(@PathVariable String id) {

        // Metodo 1
        Todo todo = todoRepository.findById(Integer.parseInt(id)).orElseThrow();
        todoRepository.delete(todo);

        // Metodo 2
    //    if(todoRepository.existsById(Integer.parseInt(id)))
    //       todoRepository.deleteById(Integer.parseInt(id));
        return "OK";

    }

}
