package app.view.administration.sites;

import app.model.Site;
import app.service.SiteService;
import app.service.SiteServiceImpl;
import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class SitesManageController implements Initializable {

    private SiteService siteService = new SiteServiceImpl();

    @FXML
    private TableView<Site> sitesList;

    @FXML
    private TableColumn<Site, String> siteName;

    @FXML
    private TextField newSiteId;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        siteName.setCellValueFactory( siteData -> new SimpleStringProperty(siteData.getValue().getName()));
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
        newSiteId.clear();
        sitesList.setItems(siteService.getAll());
    }
}
