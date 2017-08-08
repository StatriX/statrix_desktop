package service;

import model.Site;

import java.util.List;

public interface SiteService {
    void save(Site site);

    void delete(int id);

    List<Site> getAll();
}
