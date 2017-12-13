package org.fasttrackit;

import java.time.LocalDate;

public class Calendar extends Planner {

    private String activityName;
    private LocalDate date;

    public String getAcitvityName() {
        return activityName;

    }

    public void setAcitvityName(String acitvityName) {
        this.activityName = acitvityName;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
