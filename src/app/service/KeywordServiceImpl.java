package app.service;

import app.model.Keyword;
import app.repository.KeywordRepository;
import app.repository.mock.InMemoryKeywordRepository;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.stream.Collectors;

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

    @Override
    public ObservableList<String> getAllKeyword(Integer id) {
        return FXCollections.observableArrayList(keywordRepository.getAllByPersonId(id)
                .stream()
                .map( p -> p.getName())
                .collect(Collectors.toList()));
    }
}
