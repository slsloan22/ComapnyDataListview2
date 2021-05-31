package sample;

import java.time.LocalDate;
import java.util.ArrayList;

public class Controller {
    public TextField textField1;
    public Button saveButton;
    public ListView myTextList;
    public DatePicker myDatePicker;

    public void initialize() {

        ToDoItem.setMyController(this);
    }

    public void updateUI() {
        // Delete every item from UI
        myTextList.getItems().clear();
        // Match data in Model and UI
        ArrayList toDoList = ToDoItem.getAllMyData();
        for (Object toDoItem : toDoList) {
            myTextList.getItems().add(toDoItem);
        }
    }

    public void userSavedText() {
        String textToSave = textField1.getText();
        LocalDate dateToSave = myDatePicker.getValue();
        ToDoItem.addToDoItem(textToSave, dateToSave);
    }
}
