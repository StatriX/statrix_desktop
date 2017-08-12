package app.model;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class User {
    private Integer id;
    private StringProperty name;
    private StringProperty password;
    private StringProperty email;
    private BooleanProperty administrator;

    public User() {
    }

    public User(String name, String password, String email, boolean administrator) {
        this.name = new SimpleStringProperty(name);
        this.password = new SimpleStringProperty(password);
        this.email = new SimpleStringProperty(email);
        this.administrator = new SimpleBooleanProperty(administrator);
    }


    public User(Integer id, String name, String password, String email, boolean administrator) {
        this.id = id;
        this.name = new SimpleStringProperty(name);
        this.password = new SimpleStringProperty(password);
        this.email = new SimpleStringProperty(email);
        this.administrator = new SimpleBooleanProperty(administrator);
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name.get();
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public StringProperty nameProperty() {
        return name;
    }

    public String getEmail() {
        return email.get();
    }

    public void setEmail(String email) {
        this.email.set(email);
    }

    public StringProperty emailProperty() {
        return email;
    }

    public boolean isAdministrator() {
        return administrator.get();
    }

    public void setAdministrator(boolean administrator) {
        this.administrator.set(administrator);
    }

    public BooleanProperty administratorProperty() {
        return administrator;
    }

    public String getPassword() {
        return password.get();
    }

    public void setPassword(String password) {
        this.password.set(password);
    }

    public StringProperty passwordProperty() {
        return password;
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
