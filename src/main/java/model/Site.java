package main.java.model;

public class Site extends CommonDirectory {

    public Site(String name, boolean defaultSite) {
        super(null, name, defaultSite);
    }

    public Site(Integer id, String name, boolean defaultSite) {
        super(id, name, defaultSite);
    }

}
