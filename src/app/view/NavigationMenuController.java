package app.view;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.util.ArrayList;

public class NavigationMenuController extends Label implements ModalWindows {

    private ArrayList<Label> labels = new ArrayList<>();

    @FXML
    private StackPane generalWindowsHolder;

    @FXML
    private HBox updateGeneralWindow;

    @FXML
    private Label statistic;

    @FXML
    private Label administration;

    @FXML
    private Label persons;

    @FXML
    private Label sites;

    @FXML
    private Label users;

    @FXML
    private Label aboutProgram;

    @FXML
    private Label messageAboutError;

    @FXML
    private Label exitLabel;

    @FXML
    private DropShadow normalLabel;

    void setGeneralWindowApp(Node node) {
        generalWindowsHolder.getChildren().setAll(node);
    }

    @FXML
    public void onExitLabelFromWindow(MouseEvent mouseEvent) {
        onShowModalWindow(mouseEvent, "/confirmation/WindowConfirmation.fxml", "Выход из программы");
    }

    @FXML
    public void showWindowStatic() {
        WindowsNavigator.loadWindowScene(WindowsNavigator.WINDOW_STATISTIC);
    }

    public void showWindowAdministrationPerson() {
        WindowsNavigator.loadWindowScene(WindowsNavigator.WINDOW_ADMINISTRATION_PERSONS);
    }

    public void showWindowAdministrationSites() {
        WindowsNavigator.loadWindowScene(WindowsNavigator.WINDOW_ADMINISTRATION_SITES);
    }

    public void showWindowAdministrationUsers() {
        WindowsNavigator.loadWindowScene(WindowsNavigator.WINDOW_ADMINISTRATION_USERS);
    }

    public void showWindowMessageAboutError() {
        WindowsNavigator.loadWindowScene(WindowsNavigator.WINDOW_MESSAGE_ABOUT_ERROR);
    }

    public void showAboutProgram() {
        WindowsNavigator.loadWindowScene(WindowsNavigator.WINDOW_MESSAGE_ABOUT_PROGRAM);
    }
}
