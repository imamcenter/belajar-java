package test.view;

import repository.TodoListRepository;
import repository.TodoListRepositoryImpl;
import service.TodoListService;
import service.TodoListServiceImpl;
import view.TodoListView;

public class TodoListViewTest {
  public static void main(String[] args) {
    testRemoveTodoList();
  }

  public static void testShowTodoList(){
    TodoListRepository todoListRepository = new TodoListRepositoryImpl();
    TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
    TodoListView todoListView = new TodoListView(todoListService);

    todoListView.showTodoList();
  }

  public static void testAddTodoList(){
    TodoListRepository todoListRepository = new TodoListRepositoryImpl();
    TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
    TodoListView todoListView = new TodoListView(todoListService);

    todoListView.addTodoList();
    todoListView.showTodoList();
  }

  public static void testRemoveTodoList(){
    TodoListRepository todoListRepository = new TodoListRepositoryImpl();
    TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
    TodoListView todoListView = new TodoListView(todoListService);

    todoListService.addTodoList("belajar java dasar");
    todoListService.addTodoList("belajar java oop");
    todoListService.addTodoList("belajar java generic");

    todoListView.removeTodoList();
    todoListService.showTodoList();
    todoListView.removeTodoList();
    todoListService.showTodoList();
  }
}
