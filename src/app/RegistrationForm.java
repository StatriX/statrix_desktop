package app;

import app.view.registration.RegistrationController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class RegistrationForm extends Application{
    private Stage primaryStage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Регистрация нового администратора");
        this.primaryStage.getIcons().add(new Image("/images/logo/favicon.png"));
        this.primaryStage.setWidth(450.0);
        this.primaryStage.setHeight(480.0);
        this.primaryStage.setResizable(false);

        initRootLayout();
    }

    private void initRootLayout() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Authorize.class.getResource("/registration/Registration.fxml"));
            AnchorPane rootLayout = loader.load();

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();

            RegistrationController registrationController = loader.getController();
            registrationController.setRegistrationForm(this);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Stage getPrimaryStage() {
        return primaryStage;
    }
}
