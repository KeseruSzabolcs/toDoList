package org.FastTrackIT.todolist;

import org.FastTrackIT.todolist.domain.ToDoItem;
import org.FastTrackIT.todolist.persistance.ToDoItemRepository;
import org.FastTrackIT.todolist.transfer.CreateToDoItemRequest;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException, IOException, ClassNotFoundException {
        CreateToDoItemRequest request = new CreateToDoItemRequest();
        request.setDescription("Learn JDBC");
        request.setDeadline(LocalDate.now().plusWeeks(1));
        ToDoItemRepository toDoItemRepository = new ToDoItemRepository();
        //toDoItemRepository.createToDoItem(request);

        //toDoItemRepository.updateToDoItem(1, true);
        //toDoItemRepository.deleteToDoItem(1);

        List<ToDoItem> toDoItems = toDoItemRepository.getToDoItems();

        System.out.println(toDoItems);
    }
}
