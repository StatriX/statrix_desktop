package service;

import model.Keyword;

import java.util.List;

public interface KeywordService {
    boolean save(Keyword keyword);

    boolean delete(int id);

    List<Keyword> getAll();
}
