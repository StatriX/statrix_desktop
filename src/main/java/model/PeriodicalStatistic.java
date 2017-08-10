package main.java.model;

import java.time.LocalDate;
import java.util.Comparator;

public class PeriodicalStatistic implements Comparable<PeriodicalStatistic> {
    private LocalDate date;
    private String person;

    public PeriodicalStatistic(LocalDate date, String person) {
        this.date = date;
        this.person = person;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PeriodicalStatistic that = (PeriodicalStatistic) o;

        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        return person != null ? person.equals(that.person) : that.person == null;
    }

    @Override
    public int hashCode() {
        int result = date != null ? date.hashCode() : 0;
        result = 31 * result + (person != null ? person.hashCode() : 0);
        return result;
    }

    @Override
    public int compareTo(PeriodicalStatistic o) {
        return Comparator.comparing(PeriodicalStatistic::getDate)
                .thenComparing(PeriodicalStatistic::getPerson)
                .compare(this, o);
    }


}
