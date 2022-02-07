package service;

import entity.Todolist;
import repository.TodoListRepository;

public class TodoListServiceImpl implements TodoListService {

  TodoListRepository todoListRepository;


  public TodoListServiceImpl(TodoListRepository todoListRepository) {
    this.todoListRepository = todoListRepository;
  }


  @Override
  public void showTodoList() {
    Todolist[] model = todoListRepository.getAll();
    System.out.println("TODOLIST");
    for (var i = 0; i < model.length; i++) {
      var todoList = model[i];
      var no = i + 1;

      if (todoList != null) {
        System.out.println(no + ". " + todoList.getTodo());
      }
    }
  }

  @Override
  public void addTodoList(String todo) {
    Todolist todolist = new Todolist(todo);
    todoListRepository.add(todolist);
    System.out.println("sukses menambah todolist" + todo);
  }

  @Override
  public void removeTodoList(Integer number) {
    boolean success = todoListRepository.remove(number);

    if (success) {
      System.out.println("SUKSES MENGHAPUS TODOLIST" + number);
    } else {
      System.out.println("GAGAL MENGHAPUS TODOLIST" + number);
    }
  }
}
