package app.repository;

import app.model.Site;

import java.util.List;

public interface SiteRepository {
    void save(Site site);

    void delete(int id);

    List<Site> getAll();
}
