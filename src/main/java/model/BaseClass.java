package model;

public abstract class BaseClass {
    private int id;
    private String name;
    private boolean defDirectory;

    public BaseClass(){

    }

    BaseClass(int id, String name, boolean defDirectory) {
        this.id = id;
        this.name = name;
        this.defDirectory = defDirectory;
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

    public boolean isDefDirectory() {
        return defDirectory;
    }

    public void setDefDirectory(boolean defDirectory) {
        this.defDirectory = defDirectory;
    }

    @Override
    public String toString() {
        return "BaseClass{" +
                "id=" + id +
                ", word='" + name + '\'' +
                ", defaultKeyword=" + defDirectory +
                '}';
    }
}
