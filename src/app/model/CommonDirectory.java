package app.model;

import javafx.beans.property.*;

public abstract class CommonDirectory {
    private Integer id;
    private StringProperty name;
    private BooleanProperty defDirectory;

    public CommonDirectory() {

    }

    CommonDirectory(Integer id, String name, boolean defDirectory) {
        this.id = id;
        this.name = new SimpleStringProperty(name);
        this.defDirectory = new SimpleBooleanProperty(defDirectory);
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

    public boolean getDefDirectory() {
        return defDirectory.get();
    }

    public void setDefDirectory(boolean defDirectory) {
        this.defDirectory.set(defDirectory);
    }

    public BooleanProperty defDirectoryProperty() {
        return defDirectory;
    }

    public boolean isNew() {
        return id == null;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "id=" + id +
                ", word='" + name + '\'' +
                ", defaultKeyword=" + defDirectory +
                '}';
    }
}
