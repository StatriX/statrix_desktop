package repository;

import model.Keyword;

import java.util.List;

public interface KeywordRepository {
    void save(Keyword keyword);

    void delete(int id);

    List<Keyword> getAll();
}
