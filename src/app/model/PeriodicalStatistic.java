package app.model;

import java.time.LocalDate;
import java.util.Comparator;

public class PeriodicalStatistic implements Comparable<PeriodicalStatistic> {
    private LocalDate date;
    private String person;
    private Integer value;

    public PeriodicalStatistic(LocalDate date, String person, Integer value) {
        this.date = date;
        this.person = person;
        this.value = value;
    }


    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }


    @Override
    public int compareTo(PeriodicalStatistic o) {
        return Comparator.comparing(PeriodicalStatistic::getDate)
                .thenComparing(PeriodicalStatistic::getPerson)
                .compare(this, o);
    }


}
