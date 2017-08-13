package app.view.administration.persons;

import app.model.Keyword;
import app.service.KeywordService;
import app.service.KeywordServiceImpl;
import app.view.confirmation.ManageConfirmation;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

public class AddEditPersonController implements ManageConfirmation {
/*
 * Здесь пока не могу реализовать вывод списка ключевых слов.
 * Необходимо научиться выбирать личность и у нее получать ID,
 * по которому и выводить список ключевых слов.
 */
    private KeywordService keywordService = new KeywordServiceImpl();

    @FXML
    public ListView<Keyword> keywordsList;


    @FXML
    Button cancelButton;

    @FXML
    public void initialize() {

    }

    @FXML
    public void closeModalWindow() {
        onExitButtonFromWindow(cancelButton);
    }
}
