package app.view;

import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public interface ModalWindows {
    default void onShowModalWindow(Event event, String fileName) {
        try {
            Stage stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource(fileName));
            stage.setTitle("Statrix");
            stage.setMinWidth(100);
            stage.setMinHeight(100);
            stage.setResizable(false);
            stage.setScene(new Scene(root));
            stage.initModality(Modality.WINDOW_MODAL);
            stage.initOwner(((Node) event.getSource()).getScene().getWindow());
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
