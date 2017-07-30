package model;

public class Person {
    private int id;
    private String name;
    private boolean defaultPerson;

    public Person(int id) {
        this.id = id;
    }

    public Person(int id, String name, boolean defaultPerson) {
        this.id = id;
        this.name = name;
        this.defaultPerson = defaultPerson;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDefaultPerson() {
        return defaultPerson;
    }

    public void setDefaultPerson(boolean defaultPerson) {
        this.defaultPerson = defaultPerson;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", defaultPerson=" + defaultPerson +
                '}';
    }
}
