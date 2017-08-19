package app.model;

import java.util.Comparator;

public class GeneralStatistic implements Comparable<GeneralStatistic> {
    private String siteName;
    private String personName;
    private Integer value;

    public GeneralStatistic(String siteName, String personName, Integer value) {
        this.siteName = siteName;
        this.personName = personName;
        this.value = value;
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

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public int compareTo(GeneralStatistic o) {
        return Comparator.comparing(GeneralStatistic::getSiteName)
                .thenComparing(GeneralStatistic::getPersonName)
                .compare(this, o);

    }
}
