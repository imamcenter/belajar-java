package test.service;

import entity.Todolist;
import repository.TodoListRepository;
import repository.TodoListRepositoryImpl;
import service.TodoListService;
import service.TodoListServiceImpl;

public class TodoListServiceTest {
  public static void main(String[] args) {
    testRemoveTodoList();
  }

  public static void testShowTodoList() {
    TodoListRepositoryImpl todoListRepository = new TodoListRepositoryImpl();
    todoListRepository.data[0] = new Todolist("belajar java dasar");
    todoListRepository.data[1] = new Todolist("belajar java oop");
    todoListRepository.data[2] = new Todolist("belajar java generic");
    todoListRepository.data[3] = new Todolist("belajar java lamda");
    TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

    todoListService.showTodoList();
  }

  public static void testAddTodoList() {
    TodoListRepository todoListRepository = new TodoListRepositoryImpl();
    TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

    todoListService.addTodoList("belajar java dasar");
    todoListService.addTodoList("belajar java oop");
    todoListService.addTodoList("belajar java generic");

    todoListService.showTodoList();
  }

  public static void testRemoveTodoList(){
    TodoListRepository todoListRepository = new TodoListRepositoryImpl();
    TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

    todoListService.addTodoList("belajar java dasar");
    todoListService.addTodoList("belajar java oop");
    todoListService.addTodoList("belajar java generic");

    todoListService.showTodoList();

    todoListService.removeTodoList(5);
    todoListService.removeTodoList(1);

    todoListService.showTodoList();
  }

}
