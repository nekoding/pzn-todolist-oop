package com.nekoding;

import com.nekoding.repositories.TodoListRepository;
import com.nekoding.repositories.TodoListRepositoryImpl;
import com.nekoding.services.TodoListService;
import com.nekoding.services.TodoListServiceImpl;
import com.nekoding.views.TodoListView;

public class AplikasiTodoList {
    public static void main(String[] args) {
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        TodoListView todoListView = new TodoListView(todoListService);

        todoListView.showTodoList();
    }
}
