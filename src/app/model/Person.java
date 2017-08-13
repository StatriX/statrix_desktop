package app.model;

public class Person extends CommonDirectory {

    public Person(String name, boolean defaultPerson) {
        super(null, name, defaultPerson);
    }

    public Person(Integer id, String name, boolean defaultPerson) {
        super(id, name, defaultPerson);
    }

}
