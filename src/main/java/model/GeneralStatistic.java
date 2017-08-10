package main.java.model;

import java.util.Comparator;

public class GeneralStatistic implements Comparable<GeneralStatistic> {
    private String siteName;
    private String personName;

    public GeneralStatistic(String siteName, String personName) {
        this.siteName = siteName;
        this.personName = personName;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GeneralStatistic that = (GeneralStatistic) o;

        if (siteName != null ? !siteName.equals(that.siteName) : that.siteName != null) return false;
        return personName != null ? personName.equals(that.personName) : that.personName == null;
    }

    @Override
    public int hashCode() {
        int result = siteName != null ? siteName.hashCode() : 0;
        result = 31 * result + (personName != null ? personName.hashCode() : 0);
        return result;
    }

    @Override
    public int compareTo(GeneralStatistic o) {
        return Comparator.comparing(GeneralStatistic::getSiteName)
                .thenComparing(GeneralStatistic::getPersonName)
                .compare(this, o);

    }
}
