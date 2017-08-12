package app.service;

import app.model.Site;
import javafx.collections.ObservableList;

public interface SiteService {
    void save(Site site);

    void delete(int id);

    ObservableList<Site> getAll();

    ObservableList<String> getAllSitesName();
}
