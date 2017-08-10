package main.java.service;

import main.java.model.Keyword;

import java.util.List;

public interface KeywordService {
    void save(Keyword keyword);

    void delete(int id);

    List<Keyword> getAllByPersonId(Integer id);
}
