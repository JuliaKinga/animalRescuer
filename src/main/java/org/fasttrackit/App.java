package org.fasttrackit;

import org.fasttrackit.accesories.Toy;

import java.time.LocalDate;

public class App
{
    public static void main( String[] args ) {
        Dog dog = new Dog();
        dog.name = "Rocky";
        dog.age = 2.5;
        dog.healthCondition = "healthy";
        dog.breed = "schnauzer";
        dog.weight = 6.5;
        dog.hight = 32.5;
        dog.color = "black";
        dog.role = "companionship";

        Rescuer rescuer = new Rescuer();
        rescuer.name = "Julia";
        rescuer.homeType = "appartment";
        rescuer.money = 500;


        Vet vet = new Vet();
        vet.specialization ="ClinicalPathology";
        vet.locator = "Cluj";
        vet.directions = "center";
        vet.name = "Laura";

        Gps gps = new Gps();
        gps.activity = "walking";
        gps.places = "parks";

        Planner planner = new Planner();
        planner.todo = "walk";
        planner.appointments = "doctor";
        planner.events = "birthday";

        DogFood dogFood = new DogFood();
        dogFood.type = "dry";
        dogFood.brand = "pedigree";
        dogFood.flavor = "chicken";
        dogFood.packaging = "bag";
        dogFood.price = 100;
        dogFood.quantity = 9.5;

        Training training = new Training();
        training.command = "sit";
        training.sound = "whistle";

        Calendar calendar = new Calendar();
        calendar.acitvityName = "training";
        calendar.date = LocalDate.now();










    }
}
