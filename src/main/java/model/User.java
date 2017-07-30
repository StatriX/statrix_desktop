package model;

public class User {
    private int id;
    private String name;
    private String email;
    private boolean administrator;

    public User() {
    }

    public User(int id, String name, String email, boolean administrator) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.administrator = administrator;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isAdministrator() {
        return administrator;
    }

    public void setAdministrator(boolean administrator) {
        this.administrator = administrator;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", administrator=" + administrator +
                '}';
    }
}
