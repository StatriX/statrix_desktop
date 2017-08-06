package app.view;

import javafx.fxml.FXMLLoader;

import java.io.IOException;

public class WindowsNavigator {

    public static final String NAVIGATION_MENU = "/navigation/NavigationMenu.fxml";
    public static final String WINDOW_STATISTIC = "/statistics/Statistic.fxml";
    public static final String WINDOW_ADMINISTRATION_PERSONS = "/administration/persons/PersonsMange.fxml";
    public static final String WINDOW_ADMINISTRATION_SITES = "/administration/sites/SitesManage.fxml";
    public static final String WINDOW_ADMINISTRATION_USERS = "/administration/users/UsersManage.fxml";
    public static final String WINDOW_MESSAGE_ABOUT_ERROR = "/messages/AboutError.fxml";
    public static final String WINDOW_MESSAGE_ABOUT_PROGRAM = "/messages/AboutProgram.fxml";

    private static NavigationMenuController navigationMenuController;

    public static void setNavigationMenuController(NavigationMenuController navigationMenuController) {
        WindowsNavigator.navigationMenuController = navigationMenuController;
    }

    public static void loadWindowScene(String fxml) {
        try {
            navigationMenuController.setGeneralWindowApp(
                    FXMLLoader.load(
                            WindowsNavigator.class.getResource(
                                    fxml
                            )
                    )
            );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}