package com.nekoding.views;

import com.nekoding.services.TodoListService;
import com.nekoding.utils.InputUtil;

public class TodoListView {

    private TodoListService todoListService;

    public TodoListView(TodoListService todoListService) {
        this.todoListService = todoListService;
    }

    public void showTodoList() {
        label:
        while (true) {
            todoListService.showTodoList();

            System.out.println("MENU: ");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("3. Keluar");

            var input = InputUtil.input("Pilih");

            switch (input) {
                case "1":
                    addTodoList();
                    break;
                case "2":
                    removeTodoList();
                    break;
                case "3":
                    System.out.println("Keluar dari aplikasi");
                    break label;
                default:
                    System.out.println("Inputan tidak dimengerti");
                    break;
            }
        }
    }

    public void addTodoList() {
        System.out.println("Menambah TODOLIST");

        var todo = InputUtil.input("Todo (x Jika Batal)");
        if (todo.equals("x")) {
            return;
        }

        todoListService.addTodoList(todo);
    }

    public void removeTodoList() {
        System.out.println("Menghapus TODOLIST");

        var number = InputUtil.input("Nomor yang dihapus (x jika batal)");
        if (number.equals("x")) {
            return;
        }

        todoListService.removeTodoList(Integer.valueOf(number));
    }
}
