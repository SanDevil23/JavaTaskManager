package com.sankalp.spring.firstspringwebapp.todo;

import java.time.LocalDate;
import java.util.List;

public class TodoService {
	private static List<Todo> todos;
	static {
		todos.add(new Todo(1, "SanDevil23", "Learn Angular", LocalDate.now().plusMonths(6), false));
		todos.add(new Todo(2, "SanDevil23", "Learn GoogleCloud", LocalDate.now().plusMonths(3), false));
		todos.add(new Todo(3, "SanDevil23", "Learn FullStack", LocalDate.now().plusMonths(7), false));
	}
	
	public List<Todo> findByUsername(String username){
		return todos;
	}
}
