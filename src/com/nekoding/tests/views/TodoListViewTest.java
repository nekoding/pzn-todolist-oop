package com.nekoding.tests.views;

import com.nekoding.repositories.TodoListRepository;
import com.nekoding.repositories.TodoListRepositoryImpl;
import com.nekoding.services.TodoListService;
import com.nekoding.services.TodoListServiceImpl;
import com.nekoding.views.TodoListView;

public class TodoListViewTest {
    public static void main(String[] args) {
        /*testShowTodoList();*/
        /*testAddTodoList();*/
        testRemoveTodoList();
    }

    public static void testShowTodoList() {
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        TodoListView todoListView = new TodoListView(todoListService);

        todoListService.addTodoList("Belajar Java Dasar");
        todoListService.addTodoList("Belajar Java OOP");
        todoListService.addTodoList("Belajar Java Standar Class");

        todoListView.showTodoList();
    }

    public static void testAddTodoList() {
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        TodoListView todoListView = new TodoListView(todoListService);

        todoListView.addTodoList();
        todoListService.showTodoList();
        todoListView.addTodoList();
        todoListService.showTodoList();
    }

    public static void testRemoveTodoList() {
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        TodoListView todoListView = new TodoListView(todoListService);

        todoListService.addTodoList("Belajar Java Dasar");
        todoListService.addTodoList("Belajar Java OOP");
        todoListService.addTodoList("Belajar Java Standar Class");

        todoListService.showTodoList();
        todoListView.removeTodoList();
        todoListService.showTodoList();
    }
}
