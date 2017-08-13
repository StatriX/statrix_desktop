package app.model;

public class Keyword extends CommonDirectory {
    private Integer personId;

    public Keyword(Integer personId, String word, boolean defaultKeyword) {
        super(null, word, defaultKeyword);
        this.personId = personId;
    }

    public Keyword(Integer id, Integer personId, String word, boolean defaultKeyword) {
        super(id, word, defaultKeyword);
        this.personId = personId;
    }


    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }


    @Override
    public String toString() {
        return "Keyword{" +
                "personId=" + personId +
                '}' + super.toString();
    }
}
