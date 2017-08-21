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
    public Label userName;
    @FXML
    private StackPane generalWindowsHolder;

    @FXML
    private Label statistic;

    @FXML
    private Label commonStatistic;

    @FXML
    private Label everydayStatistic;

    @FXML
    private Label administration;

    @FXML
    private Label persons;

    @FXML
    private Label sites;

    @FXML
    private Label users;

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
        commonStatistic.setId("buttonMenu_focus");
        everydayStatistic.setId("buttonMenu");
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
    public void showCommonStatistic() {
        WindowsNavigator.loadWindowScene(WindowsNavigator.WINDOW_COMMON_STATISTIC);
        initialize();
        commonStatistic.setId("buttonMenu_focus");
        allotPressedButton(commonStatistic);
    }

    @FXML
    public void showEverydayStatistic() {
        WindowsNavigator.loadWindowScene(WindowsNavigator.WINDOW_EVERYDAY_STATISTIC);
        initialize();
        everydayStatistic.setId("buttonMenu_focus");
        allotPressedButton(everydayStatistic);
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

        if (region.equals(commonStatistic) || region.equals(everydayStatistic)) {
            statistic.setId("statisticButton_focus");
        } else {
            statistic.setId("statisticButton");
        }

        if (region.equals(commonStatistic)) {
            commonStatistic.setId("buttonMenu_focus");
        } else {
            commonStatistic.setId("buttonMenu");
        }
    }
}
