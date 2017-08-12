package app.view.administration.persons;

import app.service.KeywordService;
import app.service.KeywordServiceImpl;
import app.view.confirmation.ManageConfirmation;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

public class AddEditPersonController implements ManageConfirmation {
/*
 * Здесь пока не могу реализовать вывод списка ключевых слов.
 * Необходимо научиться выбирать личность и у нее получать ID,
 * по которому и выводить список ключевых слов.
 */
    private KeywordService keywordService = new KeywordServiceImpl();

    @FXML
    public ListView<String> keywordsList;

    @FXML
    Button cancelButton;

    @FXML
    public void closeModalWindow() {
        onExitButtonFromWindow(cancelButton);
    }
}
