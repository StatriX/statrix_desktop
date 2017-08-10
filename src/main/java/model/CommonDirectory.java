package main.java.model;

public abstract class CommonDirectory {
    private Integer id;
    private String name;
    private boolean defDirectory;

    public CommonDirectory() {

    }

    CommonDirectory(Integer id, String name, boolean defDirectory) {
        this.id = id;
        this.name = name;
        this.defDirectory = defDirectory;
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

    public boolean isDefDirectory() {
        return defDirectory;
    }

    public void setDefDirectory(boolean defDirectory) {
        this.defDirectory = defDirectory;
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
