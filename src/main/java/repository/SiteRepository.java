package main.java.repository;

import main.java.model.Site;

import java.util.List;

public interface SiteRepository {
    void save(Site site);

    void delete(int id);

    List<Site> getAll();
}
