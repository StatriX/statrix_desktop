package app.view.administration.persons;

import app.service.PersonService;
import app.service.PersonServiceImpl;
import app.view.ModalWindows;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class PersonsMangeController implements ModalWindows, Initializable {

    private PersonService personService = new PersonServiceImpl();

    @FXML
    public ListView<String> personsList;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        personsList.setItems(personService.getAllName());
    }

    @FXML
    public void addEditPerson(MouseEvent mouseEvent) {
        onShowModalWindow(mouseEvent, "/administration/persons/AddEditPerson.fxml", "Добавление/редактирование личности");
    }
}
