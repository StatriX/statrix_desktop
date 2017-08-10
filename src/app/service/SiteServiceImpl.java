package app.service;

import app.model.Site;
import app.repository.SiteRepository;
import app.repository.mock.InMemorySiteRepository;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

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
