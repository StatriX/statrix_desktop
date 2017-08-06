package app.view.administration.persons;

import app.view.ModalWindows;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

public class PersonsMangeController implements ModalWindows {

    @FXML
    public void addEditPerson(MouseEvent mouseEvent) {
        onShowModalWindow(mouseEvent, "/administration/persons/AddEditPerson.fxml");
    }
}
