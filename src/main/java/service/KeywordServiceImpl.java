package main.java.service;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import main.java.model.Keyword;
import main.java.repository.KeywordRepository;
import main.java.repository.mock.InMemoryKeywordRepository;

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
    public ObservableList<Keyword> getAllByPersonId(Integer id) {
        return FXCollections.observableArrayList(keywordRepository.getAllByPersonId(id));
    }
}
