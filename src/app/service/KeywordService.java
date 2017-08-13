package app.service;

import app.model.Keyword;
import javafx.collections.ObservableList;

public interface KeywordService {
    void save(Keyword keyword);

    void delete(int id);

    ObservableList<Keyword> getAllByPersonId(Integer id);

    ObservableList<String> getAllKeyword(Integer id);
}
