package repository;

import model.Site;

import java.util.List;

public interface SiteRepository {
    boolean save(Site site);

    boolean delete(int id);

    List<Site> getAll();
}
