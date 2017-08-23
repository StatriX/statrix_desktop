package app.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.util.Comparator;

public class GeneralStatistic implements Comparable<GeneralStatistic> {
    private StringProperty siteName;
    private StringProperty personName;
    private IntegerProperty value;

    public GeneralStatistic(String siteName, String personName, Integer value) {
        this.siteName = new SimpleStringProperty(siteName);
        this.personName = new SimpleStringProperty(personName);
        this.value = new SimpleIntegerProperty(value);
    }


    private String getSiteName() {
        return siteName.get();
    }

    public StringProperty siteNameProperty() {
        return siteName;
    }

    private String getPersonName() {
        return personName.get();
    }

    public StringProperty personNameProperty() {
        return personName;
    }

    public IntegerProperty valueProperty() {
        return value;
    }

    @Override
    public int compareTo(GeneralStatistic o) {
        return Comparator.comparing(GeneralStatistic::getPersonName)
                .thenComparing(GeneralStatistic::getSiteName)
                .compare(this, o);

    }
}
