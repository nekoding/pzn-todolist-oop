package com.nekoding.repositories;

import com.nekoding.entities.TodoList;

import java.util.ArrayList;

public interface TodoListRepository {

    public ArrayList<TodoList> getAll();

    public void add(TodoList todoList);

    public boolean remove(int number);
}
