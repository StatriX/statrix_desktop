package service;

import model.Keyword;
import repository.KeywordRepository;
import repository.mock.InMemoryKeyworRepository;

import java.util.List;

public class KeywordServiceImpl implements KeywordService {
    private KeywordRepository keywordRepository = new InMemoryKeyworRepository();

    @Override
    public void save(Keyword keyword) {
        keywordRepository.save(keyword);
    }

    @Override
    public void delete(int id) {
        keywordRepository.delete(id);
    }

    @Override
    public List<Keyword> getAll() {
        return keywordRepository.getAll();
    }
}
