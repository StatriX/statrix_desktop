package app.service;

import app.model.Site;
import app.repository.SiteRepository;
import app.repository.mock.InMemorySiteRepository;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.stream.Collectors;

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

    @Override
    public ObservableList<String> getAllSitesName() {
        return FXCollections.observableArrayList(siteRepository.getAll()
                .stream()
                .map( p -> p.getName())
                .collect(Collectors.toList()));
    }
}
