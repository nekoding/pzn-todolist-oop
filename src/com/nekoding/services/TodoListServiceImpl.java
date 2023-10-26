package com.nekoding.services;

import com.nekoding.entities.TodoList;
import com.nekoding.repositories.TodoListRepository;

import java.util.ArrayList;

public class TodoListServiceImpl implements TodoListService {

    private TodoListRepository todoListRepository;

    public TodoListServiceImpl(TodoListRepository todoListRepository) {
        this.todoListRepository = todoListRepository;
    }

    @Override
    public void showTodoList() {
        ArrayList<TodoList> model = todoListRepository.getAll();

        System.out.println("TODOLIST: ");
        for (int i = 0; i < model.size(); i++) {
            var todolist = model.get(i);
            var no = i + 1;

            if (todolist != null) {
                System.out.println(no + ". " + todolist.getTodo());
            }
        }
    }

    @Override
    public void addTodoList(String todo) {
        TodoList todoList = new TodoList(todo);
        todoListRepository.add(todoList);
        System.out.println("Sukses menambahkan todo: " + todo);
    }

    @Override
    public void removeTodoList(Integer number) {
        boolean result = todoListRepository.remove(number);
        if (result) {
            System.out.println("Sukses menghapus todo: " + number);
        } else {
            System.out.println("Gagal menghapus todo: " + number);
        }
    }
}
