package app;

import app.view.NavigationMenuController;
import app.view.WindowsNavigator;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class GeneralApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Statrix");
        primaryStage.setMinWidth(800.0);
        primaryStage.setMinHeight(600.0);
        primaryStage.setMaxWidth(1000.0);
        primaryStage.getIcons().add(new Image("/images/logo/favicon.png"));
        primaryStage.setResizable(false);

        primaryStage.setScene(createScene(loadRootPane()));

        primaryStage.show();
    }

    private Pane loadRootPane() throws IOException {
        FXMLLoader loader = new FXMLLoader();

        Pane rootPane = loader.load(
                getClass().getResourceAsStream(
                        WindowsNavigator.NAVIGATION_MENU
                )
        );

        NavigationMenuController navigationMenuController = loader.getController();

        WindowsNavigator.setNavigationMenuController(navigationMenuController);
        WindowsNavigator.loadWindowScene(WindowsNavigator.WINDOW_COMMON_STATISTIC);

        return rootPane;
    }

    private Scene createScene(Pane rootPane) {

        return new Scene(rootPane);
    }
}
