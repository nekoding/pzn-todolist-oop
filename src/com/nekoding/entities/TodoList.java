package com.nekoding.entities;

public class TodoList {
    String todo;

    public TodoList() {
    }

    public TodoList(String todo) {
        this.todo = todo;
    }

    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }
}
