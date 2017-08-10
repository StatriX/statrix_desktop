package main.java.service;

import javafx.collections.ObservableList;
import main.java.model.Keyword;

public interface KeywordService {
    void save(Keyword keyword);

    void delete(int id);

    ObservableList<Keyword> getAllByPersonId(Integer id);
}
