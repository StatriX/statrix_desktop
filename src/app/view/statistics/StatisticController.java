package app.view.statistics;

import app.view.ModalWindows;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class StatisticController implements ModalWindows {

    @FXML
    public Button showCommonStatistic;

    @FXML
    private Button showEverydayStatistic;

    @FXML
    public void showWindowStatistic(ActionEvent actionEvent) {

        String fileName = null;

        if (showCommonStatistic.isFocused()) {
            fileName = "/statistics/CommonStatistic.fxml";
        } else if (showEverydayStatistic.isFocused()) {
            fileName = "/statistics/EverydayStatistic.fxml";
        }

        onShowModalWindow(actionEvent, fileName);
    }
}
