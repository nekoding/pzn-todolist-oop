package com.nekoding.repositories;

import com.nekoding.entities.TodoList;

import java.util.ArrayList;

public class TodoListRepositoryImpl implements TodoListRepository {

    private final ArrayList<TodoList> data = new ArrayList<>();

    @Override
    public ArrayList<TodoList> getAll() {
        return data;
    }

    @Override
    public void add(TodoList todoList) {
        data.add(todoList);
    }

    @Override
    public boolean remove(int number) {
        if (number - 1 >= data.size() || number < 0) {
            return false;
        }

        if (data.get(number - 1) == null) {
            return false;
        }

        data.remove(number - 1);
        return true;
    }
}
