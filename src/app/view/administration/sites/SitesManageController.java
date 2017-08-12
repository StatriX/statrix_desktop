package app.view.administration.sites;

import app.model.Site;
import app.service.SiteService;
import app.service.SiteServiceImpl;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class SitesManageController implements Initializable {

    private SiteService siteService = new SiteServiceImpl();

    @FXML
    private ListView<Site> sitesList;

    @FXML
    private TextField newSiteId;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        sitesList.setItems(siteService.getAll());
    }

    @FXML
    public void handleDeleteSite() {
        int selectedIndex = sitesList.getSelectionModel().getSelectedItem().getId();
        siteService.delete(selectedIndex);
        sitesList.setItems(siteService.getAll());
    }

    @FXML void handleAddSite() {
        Site tmpSite = new Site(newSiteId.getText());
        siteService.save(tmpSite);
        sitesList.setItems(siteService.getAll());
    }
}
