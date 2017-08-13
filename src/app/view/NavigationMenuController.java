package app.view;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;

public class NavigationMenuController implements ModalWindows {

    @FXML
    private StackPane generalWindowsHolder;

    @FXML
    private Button statistic;

    @FXML
    private Label administration;

    @FXML
    private Button persons;

    @FXML
    private Button sites;

    @FXML
    private Button users;

    @FXML
    private Button aboutProgram;

    @FXML
    private Button messageAboutError;

    @FXML
    private Button exitButton;

    void setGeneralWindowApp(Node node) {
        generalWindowsHolder.getChildren().setAll(node);
    }

    @FXML
    public void onExitButtonFromWindow(MouseEvent mouseEvent) {
        onShowModalWindow(mouseEvent, "/confirmation/WindowConfirmation.fxml", "Выход из программы");
        allotAdministration(exitButton);
    }

    @FXML
    public void showWindowStatistic() {
        WindowsNavigator.loadWindowScene(WindowsNavigator.WINDOW_STATISTIC);
        allotAdministration(statistic);
    }

    public void showWindowAdministrationPerson() {
        WindowsNavigator.loadWindowScene(WindowsNavigator.WINDOW_ADMINISTRATION_PERSONS);
        allotAdministration(persons);
    }

    public void showWindowAdministrationSites() {
        WindowsNavigator.loadWindowScene(WindowsNavigator.WINDOW_ADMINISTRATION_SITES);
        allotAdministration(sites);
    }

    public void showWindowAdministrationUsers() {
        WindowsNavigator.loadWindowScene(WindowsNavigator.WINDOW_ADMINISTRATION_USERS);
        allotAdministration(users);
    }

    public void showWindowMessageAboutError() {
        WindowsNavigator.loadWindowScene(WindowsNavigator.WINDOW_MESSAGE_ABOUT_ERROR);
        allotAdministration(messageAboutError);
    }

    public void showAboutProgram() {
        WindowsNavigator.loadWindowScene(WindowsNavigator.WINDOW_MESSAGE_ABOUT_PROGRAM);
        allotAdministration(aboutProgram);
    }

    public void allotAdministration(Region region) {
        if (region.equals(persons) || region.equals(sites) || region.equals(users)
                || region.equals(administration)) {
            administration.setId("selectedAdministration_focus");
        } else {
            administration.setId("selectedAdministration");
        }
    }
}
