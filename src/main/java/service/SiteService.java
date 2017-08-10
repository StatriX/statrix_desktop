package main.java.service;

import javafx.collections.ObservableList;
import main.java.model.Site;

public interface SiteService {
    void save(Site site);

    void delete(int id);

    ObservableList<Site> getAll();
}
