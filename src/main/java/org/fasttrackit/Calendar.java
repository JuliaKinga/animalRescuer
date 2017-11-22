package org.fasttrackit;

import java.time.LocalDate;

public class Calendar extends Planner {

    private String acitvityName;
    private LocalDate date;

    public String getAcitvityName() {
        return acitvityName;
    }

    public void setAcitvityName(String acitvityName) {
        this.acitvityName = acitvityName;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
