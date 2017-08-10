package main.java.service;

import main.java.model.Keyword;
import main.java.repository.KeywordRepository;
import main.java.repository.mock.InMemoryKeywordRepository;

import java.util.List;

public class KeywordServiceImpl implements KeywordService {
    private KeywordRepository keywordRepository = new InMemoryKeywordRepository();

    @Override
    public void save(Keyword keyword) {
        keywordRepository.save(keyword);
    }

    @Override
    public void delete(int id) {
        keywordRepository.delete(id);
    }

    @Override
    public List<Keyword> getAllByPersonId(Integer id) {
        return keywordRepository.getAllByPersonId(id);
    }
}
