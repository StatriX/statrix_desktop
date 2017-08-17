package app;

import app.view.authorize.AuthorizedController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Authorize extends Application {

    private Stage primaryStage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Авторизация");
        this.primaryStage.getIcons().add(new Image("/images/logo/favicon.png"));
        this.primaryStage.setWidth(290.0);
        this.primaryStage.setHeight(370.0);
        this.primaryStage.setResizable(false);

        initRootLayout();
    }

    private void initRootLayout() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Authorize.class.getResource("/authorize/AuthorizedWindowStart.fxml"));
            AnchorPane rootLayout = loader.load();

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();

            AuthorizedController authorizedController = loader.getController();
            authorizedController.setAuthorize(this);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
