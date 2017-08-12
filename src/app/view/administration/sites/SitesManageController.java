package app.view.administration.sites;

import app.service.SiteService;
import app.service.SiteServiceImpl;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

public class SitesManageController implements Initializable {

    private SiteService siteService = new SiteServiceImpl();

    @FXML
    public ListView<String> sitesList;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        sitesList.setItems(siteService.getAllSitesName());
    }
}
