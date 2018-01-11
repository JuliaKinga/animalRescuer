package org.fasttrackit;

import org.fasttrackit.accesories.Toy;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Rocky");
        dog.setAge(2.5);
        dog.setHealthCondition("healthy");
        dog.setBreed("schnauzer");

        Cat cat = new Cat();
        cat.setColor("black");
        cat.setHight(20);
        cat.setWeight(3.7);
        cat.setRole("companionship");

        Rescuer rescuer =new Rescuer() {
        };
        rescuer.setName("Julia");
        rescuer.setHomeType("appartment");
        rescuer.setMoney(500);


        Vet vet = new Vet();
        vet.setSpecialization("ClinicalPathology");
        vet.setLocator("Cluj");
        vet.setDirections("center");
        vet.setName("Laura");

        Gps gps = new Gps();
        gps.setActivity("walking");
        gps.setPlaces("parks");

        Planner planner = new Planner();
        planner.setTodo("walk");
        planner.setAppointments("doctor");
        planner.setEvents("birthday");

        DogFood dogFood = new DogFood("pedigree");
        dogFood.setType("dry");
        dogFood.setFlavor("beef");
        dogFood.setPackaging("bag");
        dogFood.setMoney(100);
        dogFood.setQuantity(9.5);

        CatFood catFood = new CatFood();
        catFood.setName("Whiskas");
        catFood.setFlavor("fish");

        Training training = new Training();
        training.setCommand("sit");
        training.setSound("whistle");

        Calendar calendar = new Calendar();
        calendar.setActivityName("training");
        calendar.setDate(LocalDate.now());

        EntertainmentActivity entertainmentActivity = new EntertainmentActivity();
        entertainmentActivity.setName("Runing");

        rescuer.feed(dog, dogFood);
        rescuer.entertain(dog, entertainmentActivity);

        rescuer.feed(cat, catFood);
        rescuer.behavior(cat, entertainmentActivity);

        planner.celebrate(dog, dog);
        planner.celebrate(cat, cat);

        Game game = new Game();
        game.start();
        }

    }
