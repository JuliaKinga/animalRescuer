package org.fasttrackit.Animal;

import org.fasttrackit.Animal.Animal;

public class Dog extends Animal {


    private double Age;
    private String healthCondition;
    private String breed;

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

    }
