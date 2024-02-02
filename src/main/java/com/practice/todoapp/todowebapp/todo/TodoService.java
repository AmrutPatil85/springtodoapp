package com.practice.todoapp.todowebapp.todo;

import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<>();

    private static int todosCount = 0;

        static {
            todos.add(new Todo(++todosCount,"abc","Learn AWS 1",
                    LocalDate.now().plusYears(1), false));
            todos.add(new Todo(++todosCount,"abc","Learn DevOps 1",
                    LocalDate.now().plusYears(2), false));
            todos.add(new Todo(++todosCount,"abc","Learn Azure 1",
                    LocalDate.now().plusYears(1), false));
        }

        public List<Todo> findByUserName(String username){
            return todos.stream().filter(todo -> todo.getUsername().equalsIgnoreCase(username)).toList();
        }

        public void addTodo(String username,String description, LocalDate targetDate, boolean done){
            Todo todo = new Todo(++todosCount,username,description,targetDate,done);
            todos.add(todo);
        }

        public void deleteById(int id){
            todos.removeIf(todo -> todo.getId()==id);
        }

    public Todo findById(int id) {
        return todos.stream().filter(todo -> todo.getId()==id).findFirst().get();
    }

    public void updateTodo(@Valid Todo todo) {
            deleteById(todo.getId());
            todos.add(todo);
    }
}
