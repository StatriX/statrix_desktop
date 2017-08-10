package main.java.model;

public class User {
    private Integer id;
    private String name;
    private String password;
    private String email;
    private boolean administrator;

    public User() {
    }

    public User(String name, String password, String email, boolean administrator) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.administrator = administrator;
    }


    public User(Integer id, String name, String password, String email, boolean administrator) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
        this.administrator = administrator;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isNew() {
        return id == null;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", administrator=" + administrator +
                '}';
    }
}
