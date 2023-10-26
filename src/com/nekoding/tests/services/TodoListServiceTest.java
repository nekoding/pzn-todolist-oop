package com.nekoding.tests.services;

import com.nekoding.entities.TodoList;
import com.nekoding.repositories.TodoListRepository;
import com.nekoding.repositories.TodoListRepositoryImpl;
import com.nekoding.services.TodoListService;
import com.nekoding.services.TodoListServiceImpl;

public class TodoListServiceTest {
    public static void main(String[] args) {
        /*testShowTodoList();*/
        /*testAddTodoList();*/
        testRemoveTodoList();
    }

    public static void testShowTodoList() {
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();

        todoListRepository.add(new TodoList("Mandi"));
        todoListRepository.add(new TodoList("Belajar"));
        todoListRepository.add(new TodoList("Berak"));

        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

        todoListService.showTodoList();
    }

    public static void testAddTodoList() {
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

        todoListService.addTodoList("Belajar Java Dasar");
        todoListService.addTodoList("Belajar Java OOP");
        todoListService.addTodoList("Belajar Java Standar Class");

        todoListService.showTodoList();
    }

    public static void testRemoveTodoList() {
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

        todoListService.addTodoList("Belajar Java Dasar");
        todoListService.addTodoList("Belajar Java OOP");
        todoListService.addTodoList("Belajar Java Standar Class");

        todoListService.showTodoList();

        todoListService.removeTodoList(5);
        todoListService.removeTodoList(2);

        todoListService.showTodoList();

        todoListService.removeTodoList(2);
        todoListService.showTodoList();

        todoListService.removeTodoList(2);
    }
}
