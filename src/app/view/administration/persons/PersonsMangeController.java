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

public class PersonsMangeController implements ModalWindows {

    private PersonService personService = new PersonServiceImpl();

    @FXML
    private TableView<Person> personTableView;

    @FXML
    private TableColumn<Person, String> personName;

    @FXML
    public void initialize() {
        personName.setCellValueFactory( personData -> new SimpleStringProperty(personData.getValue().getName()));
        personTableView.setItems(personService.getAll());
    }

    @FXML
    public void addEditPerson(MouseEvent mouseEvent) {
        onShowModalWindow(mouseEvent, "/administration/persons/AddEditPerson.fxml", "Добавление/редактирование личности");
    }



    @FXML
    public void handleDeletePerson() {
        if(personTableView.getSelectionModel().getSelectedIndex() > 0) {
            personService.delete(personTableView.getSelectionModel().getSelectedItem().getId());
            personTableView.setItems(personService.getAll());
        }
    }

}
