package service;

import model.Site;
import repository.SiteRepository;
import repository.mock.InMemorySiteRepository;

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
    public List<Site> getAll() {
        return siteRepository.getAll();
    }
}
