package org.fasttrackit;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Game {

    private Rescuer rescuer;
    private Animal animal;
    private DogFood dogFood;
    private Vet vet;
    private List<Food> availableFood = new ArrayList<Food>();
    private EntertainmentActivity[] availableActivities = new EntertainmentActivity[10];

    private void initFood() {
        Food food = new Food();
        food.setFood("Akana");

        Food food1 = new Food();
        food.setFood("Royal");
        }

    private void initActivities(){
        EntertainmentActivity activity = new EntertainmentActivity();
        activity.setName("run");

        EntertainmentActivity activity1 = new EntertainmentActivity();
        activity.setName("hunting");

    }

    public List<Food> getAvailableFood() {
        return availableFood;
    }

    public void setAvailableFood(List<Food> availableFood) {
        this.availableFood = availableFood;
    }

    public EntertainmentActivity[] getAvailableActivities() {
        return availableActivities;
    }

    public void setAvailableActivities(EntertainmentActivity[] availableActivities) {
        this.availableActivities = availableActivities;
    }

    public Rescuer getRescuer() {
        return rescuer;
    }

    public void setRescuer(Rescuer rescuer) {
        this.rescuer = rescuer;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public DogFood getDogFood() {
        return dogFood;
    }

    public void setDogFood(DogFood dogFood) {
        this.dogFood = dogFood;
    }

    public Vet getVet() {
        return vet;
    }

    public void setVet(Vet vet) {
        this.vet = vet;
    }
}
