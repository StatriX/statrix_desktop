package service;

import model.Keyword;

import java.util.List;

public interface KeywordService {
    void save(Keyword keyword);

    void delete(int id);

    List<Keyword> getAll();
}
