package com.sankalp.spring.firstspringwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import jakarta.persistence.criteria.Predicate;
import jakarta.validation.Valid;

@Service
public class TodoService {
	private static List<Todo> todos = new ArrayList<>();
	public static int todosCount = 0;
	static {
		todos.add(new Todo(++todosCount, "SanDevil23", "Learn Angular", LocalDate.now().plusMonths(6), false));
		todos.add(new Todo(++todosCount, "SanDevil23", "Learn GoogleCloud", LocalDate.now().plusMonths(3), false));
		todos.add(new Todo(++todosCount, "SanDevil23", "Learn FullStack", LocalDate.now().plusMonths(7), false));
	}
	
	public List<Todo> findByUsername(String username){
		return todos;
	}
	
	public void addTodo(String username, String description, LocalDate targetDate, boolean done) {
		Todo todo = new Todo(++todosCount,username, description, targetDate, done );
		todos.add(todo);
	}
	
	public void deleteById(int id) {
		// todo.getId() == id
		// todo -> todo.getId() == id
		java.util.function.Predicate<? super Todo> predicate 
			= todo -> todo.getId() == id;
		todos.removeIf(predicate);
		
	}
	
	public Todo findById(int id) {
		java.util.function.Predicate<? super Todo> predicate 
		= todo -> todo.getId() == id;
		Todo todo = todos.stream().filter(predicate).findFirst().get();
		return todo;
	}
	
	public void updateTodo(@Valid Todo todo) {
		deleteById(todo.getId());
		todos.add(todo);
	}
	
	
}
