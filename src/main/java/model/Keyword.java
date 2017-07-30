package model;

public class Keyword {
    private int id;
    private String word;
    private boolean defaultKeyword;

    public Keyword() {
    }

    public Keyword(int id, String word, boolean defaultKeyword) {
        this.id = id;
        this.word = word;
        this.defaultKeyword = defaultKeyword;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public boolean isDefaultKeyword() {
        return defaultKeyword;
    }

    public void setDefaultKeyword(boolean defaultKeyword) {
        this.defaultKeyword = defaultKeyword;
    }

    @Override
    public String toString() {
        return "Keyword{" +
                "id=" + id +
                ", word='" + word + '\'' +
                ", defaultKeyword=" + defaultKeyword +
                '}';
    }
}
