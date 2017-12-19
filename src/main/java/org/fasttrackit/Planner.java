package org.fasttrackit;

public class Planner {
    private String todo;
    private String appointments;
    private String events;

    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public String getAppointments() {
        return appointments;
    }

    public void setAppointments(String appointments) {
        this.appointments = appointments;
    }

    public String getEvents() {
        return events;
    }

    public void setEvents(String events) {
        this.events = events;
    }

    public void celebrate(Animal animal, Dog dog) {
        System.out.println(this.events + "just celebrated" + dog.getAge() + "age" + animal.getName());}

    public void celebrate(Animal animal, Cat cat) {
        System.out.println(this.events + "just celebrated" + cat.getAge() + "age" + animal.getName());

    }}


