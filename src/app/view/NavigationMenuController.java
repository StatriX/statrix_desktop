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
    public void initialize() {
        statistic.setId("statisticButton_focus");
        administration.setId("selectedAdministration");
        persons.setId("buttonMenu");
        sites.setId("buttonMenu");
        users.setId("buttonMenu");
        aboutProgram.setId("buttonMenu");
        messageAboutError.setId("buttonMenu");
        exitButton.setId("buttonMenu");
    }

    @FXML
    public void onExitButtonFromWindow(MouseEvent mouseEvent) {
        onShowModalWindow(mouseEvent, "/confirmation/WindowConfirmation.fxml", "Выход из программы");
        allotPressedButton(exitButton);
    }

    @FXML
    public void showWindowStatistic() {
        WindowsNavigator.loadWindowScene(WindowsNavigator.WINDOW_STATISTIC);
        initialize();

        allotPressedButton(statistic);
    }

    public void showWindowAdministrationPerson() {
        WindowsNavigator.loadWindowScene(WindowsNavigator.WINDOW_ADMINISTRATION_PERSONS);
        initialize();
        persons.setId("buttonMenu_focus");
        allotPressedButton(persons);
    }

    public void showWindowAdministrationSites() {
        WindowsNavigator.loadWindowScene(WindowsNavigator.WINDOW_ADMINISTRATION_SITES);
        initialize();
        sites.setId("buttonMenu_focus");
        allotPressedButton(sites);
    }

    public void showWindowAdministrationUsers() {
        WindowsNavigator.loadWindowScene(WindowsNavigator.WINDOW_ADMINISTRATION_USERS);
        initialize();
        users.setId("buttonMenu_focus");
        allotPressedButton(users);
    }

    public void showWindowMessageAboutError() {
        WindowsNavigator.loadWindowScene(WindowsNavigator.WINDOW_MESSAGE_ABOUT_ERROR);
        initialize();
        messageAboutError.setId("buttonMenu_focus");
        allotPressedButton(messageAboutError);
    }

    public void showAboutProgram() {
        WindowsNavigator.loadWindowScene(WindowsNavigator.WINDOW_MESSAGE_ABOUT_PROGRAM);
        initialize();
        aboutProgram.setId("buttonMenu_focus");
        allotPressedButton(aboutProgram);
    }

    public void allotPressedButton(Region region) {
        if (region.equals(persons) || region.equals(sites) || region.equals(users)
                || region.equals(administration)) {
            administration.setId("selectedAdministration_focus");
        } else {
            administration.setId("selectedAdministration");
        }

        if (region.equals(statistic)) {
            statistic.setId("statisticButton_focus");
        } else {
            statistic.setId("statisticButton");
        }
    }
}
