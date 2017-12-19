package org.fasttrackit;

public class Dog extends Animal {


    private double Age;
    private String healthCondition;
    private String breed;
    private String name;

    public double getAge() {
        return Age;
    }

    public void setAge(double age) {
        this.Age = age;
    }

    public String getHealthCondition() {
        return healthCondition;
    }

    public void setHealthCondition(String healthCondition) {
        this.healthCondition = healthCondition;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    }
