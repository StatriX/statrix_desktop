package app.view.statistics;

import app.model.Person;
import app.model.Site;
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
import java.util.ArrayList;
import java.util.List;

public class Overview {

    public static final String COMMON_STATISTIC_DIALOG_STAGE = "/statistics/CommonStatistic.fxml";
    public static final String EVERYDAY_STATISTIC_DIALOG_STAGE = "/statistics/EverydayStatistic.fxml";
    private ArrayList<String> dialogStages = new ArrayList<>();

    {
        dialogStages.add(COMMON_STATISTIC_DIALOG_STAGE);
        dialogStages.add(EVERYDAY_STATISTIC_DIALOG_STAGE);
    }

    public void showStatistic(Event event, List<Person> selectedPersons, List<Site> selectedSites, String title, String fxmlFile) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource(fxmlFile));
            Parent root = loader.load();

            Stage dialogStage = new Stage();
            dialogStage.setTitle(title);
            dialogStage.getIcons().add(new Image("/images/logo/favicon.png"));
            dialogStage.setFullScreen(false);
            dialogStage.setMinWidth(750);
            dialogStage.setMinHeight(630);
            dialogStage.setResizable(false);
            dialogStage.initModality(Modality.WINDOW_MODAL);
            dialogStage.initOwner(((Node) event.getSource()).getScene().getWindow());
            dialogStage.setScene(new Scene(root));

            for (String fxmlFileArrayList : dialogStages) {
                if (fxmlFile.equals(fxmlFileArrayList)) {
                    switch (fxmlFile) {
                        case COMMON_STATISTIC_DIALOG_STAGE :
                            CommonStatisticOverviewController controller = loader.getController();
                            controller.setDialogStage(dialogStage);
                            controller.setSelectedPersons(selectedPersons);
                            controller.setSelectedSites(selectedSites);
                            controller.getTableView();
                            controller.setOverview(this);
                            break;

                        case EVERYDAY_STATISTIC_DIALOG_STAGE :
                            break;

                    }
                }
            }

            //Parent root = loader.load();
            //dialogStage.setScene(new Scene(root));
            dialogStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
