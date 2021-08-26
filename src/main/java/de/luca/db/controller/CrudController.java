package de.luca.db.controller;


import de.luca.db.model.Todo;
import de.luca.db.persistence.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/v1")
public class CrudController {

    @Autowired
    private TodoRepository todoRepository;


    @GetMapping("/todos")
    public ResponseEntity<Flux<Todo>> getAllTodos(){
        return ResponseEntity.ok(todoRepository.findAll());
    }

    @GetMapping("/todo/{name}")
    public Mono<ResponseEntity<Todo>> getTodoByName(@PathVariable String name){
        return Mono.just(ResponseEntity.ok(todoRepository.findByName(name)));
    }

    @DeleteMapping("/todo/{name}")
    public Mono<ResponseEntity<Mono<Void>>> deleteTodoByName(@PathVariable String name){
        Todo deleteObject = todoRepository.findByName(name);
        return Mono.just(ResponseEntity.ok(todoRepository.delete(deleteObject)));
    }

    @PostMapping("/todo")
    public Mono<ResponseEntity<Mono<Todo>>> saveTodo(@RequestBody Todo todo){
        return Mono.just(ResponseEntity.ok(todoRepository.insert(todo)));
    }

}
