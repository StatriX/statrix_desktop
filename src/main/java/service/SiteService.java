package service;

import model.Site;

import java.util.List;

public interface SiteService {
    boolean save(Site site);

    boolean delete(int id);

    List<Site> getAll();
}
