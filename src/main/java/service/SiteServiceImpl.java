package main.java.service;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import main.java.model.Site;
import main.java.repository.SiteRepository;
import main.java.repository.mock.InMemorySiteRepository;

import java.util.List;

public class SiteServiceImpl implements SiteService {
    private SiteRepository siteRepository = new InMemorySiteRepository();

    @Override
    public void save(Site site) {
        siteRepository.save(site);
    }

    @Override
    public void delete(int id) {
        siteRepository.delete(id);
    }

    @Override
    public ObservableList<Site> getAll() {
        return FXCollections.observableArrayList(siteRepository.getAll());
    }
}
