package repository;

import model.Keyword;

import java.util.List;

public interface KeywordRepository {
    boolean save(Keyword keyword);

    boolean delete(int id);

    List<Keyword> getAll();
}
