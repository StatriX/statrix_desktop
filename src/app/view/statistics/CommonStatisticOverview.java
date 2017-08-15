package app.view.statistics;

import app.model.Person;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class CommonStatisticOverview {

    public void showCommonStatistic(Event event, ObservableList<Person> selectedPersons) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/statistics/CommonStatistic.fxml"));
            Parent root = loader.load();

            Stage dialogStage = new Stage();
            dialogStage.setTitle("Общая статистика");
            dialogStage.getIcons().add(new Image("/images/logo/favicon.png"));
            dialogStage.setFullScreen(false);
            dialogStage.setMinWidth(750);
            dialogStage.setMinHeight(630);
            dialogStage.setResizable(false);
            dialogStage.initModality(Modality.WINDOW_MODAL);
            dialogStage.initOwner(((Node) event.getSource()).getScene().getWindow());
            dialogStage.setScene(new Scene(root));

            CommonStatisticOverviewController controller = loader.getController();
            controller.setDialogStage(dialogStage);
            controller.setSelectedPersons(selectedPersons);
            controller.setCommonStatisticOverview(this);

            dialogStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
