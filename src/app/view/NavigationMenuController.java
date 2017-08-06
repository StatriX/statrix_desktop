package app.view;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;

public class NavigationMenuController implements ModalWindows {

    @FXML
    private StackPane generalWindowsHolder;

    void setGeneralWindowApp(Node node) {
        generalWindowsHolder.getChildren().setAll(node);
    }

    @FXML
    public void onExitLabelFromWindow(MouseEvent mouseEvent) {
        onShowModalWindow(mouseEvent, "/confirmation/WindowConfirmation.fxml");
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