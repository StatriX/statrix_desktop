package app.view.administration.persons;

import app.model.Keyword;
import app.model.Person;
import app.service.KeywordService;
import app.service.KeywordServiceImpl;
import app.service.PersonService;
import app.service.PersonServiceImpl;
import app.view.confirmation.ManageConfirmation;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class AddEditPersonController implements ManageConfirmation {

    /*
         * Здесь пока не могу реализовать вывод списка ключевых слов.
         * Необходимо научиться выбирать личность и у нее получать ID,
         * по которому и выводить список ключевых слов.
         */
    private KeywordService keywordService = new KeywordServiceImpl();
    private PersonService personService = new PersonServiceImpl();
    private Person person;

    @FXML
    private TextField newPersonName;
    @FXML
    private TableView<Keyword> keywordsTable;
    @FXML
    private TableColumn<Keyword, String> keywordsList;
    @FXML
    Button cancelButton;
    @FXML
    private TextField newKeywordId;
    @FXML
    private Button saveChange;

    @FXML
    public void initialize() {
    }

    @FXML
    public void addPerson() {
        person = new Person(newPersonName.getText(), false);
        personService.save(person);
    }

    @FXML
    public void addKeyword() {
        Keyword keyword = new Keyword(person.getId(), newKeywordId.getText(), false);
        keywordService.save(keyword);
        newKeywordId.clear();
        keywordsTable.setItems(keywordService.getAllByPersonId(person.getId()));
    }

    @FXML
    public void deleteKeyword() {
        if (keywordsTable.getSelectionModel().getSelectedIndex() > 0) {
            keywordService.delete(keywordsTable.getSelectionModel().getSelectedItem().getId());
            keywordsTable.setItems(keywordService.getAllByPersonId(person.getId()));
        }
    }



    @FXML
    public void closeModalWindow() {
        onExitButtonFromWindow(cancelButton);
    }
}
