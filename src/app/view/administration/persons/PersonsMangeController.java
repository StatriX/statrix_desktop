package app.view.administration.persons;

import app.model.Person;
import app.service.PersonService;
import app.service.PersonServiceImpl;
import app.view.ModalWindows;
import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class PersonsMangeController implements ModalWindows, Initializable {

    private PersonService personService = new PersonServiceImpl();

    @FXML
    private TableView<Person> personTableView;

    @FXML
    private TableColumn<Person, String> personName;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        personName.setCellValueFactory( personData -> new SimpleStringProperty(personData.getValue().getName()));
        personTableView.setItems(personService.getAll());
    }

    @FXML
    public void addEditPerson(MouseEvent mouseEvent) {
        onShowModalWindow(mouseEvent, "/administration/persons/AddEditPerson.fxml", "Добавление/редактирование личности");
    }

    @FXML
    public void handleDeletePerson() {
        int selectedIndexPerson = personTableView.getSelectionModel().getSelectedItem().getId();

        personService.delete(selectedIndexPerson);
        personTableView.setItems(personService.getAll());
    }

}
