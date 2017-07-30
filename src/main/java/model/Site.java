package model;

public class Site {
    private int id;
    private String name;
    private String url;
    private boolean defaultSite;

    public Site() {

    }

    public Site(int id, String name, String url, boolean defaultSite) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.defaultSite = defaultSite;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isDefaultSite() {
        return defaultSite;
    }

    public void setDefaultSite(boolean defaultSite) {
        this.defaultSite = defaultSite;
    }

    @Override
    public String toString() {
        return "Site{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", defaultSite=" + defaultSite +
                '}';
    }
}
