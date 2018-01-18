package org.fasttrackit;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Game {

    private Rescuer rescuer;
    private Animal animal;
    private DogFood dogFood;
    private Vet vet;
    private List<Food> availableFood = new ArrayList<Food>();
    private EntertainmentActivity[] availableActivities = new EntertainmentActivity[10];

    private String initRescuer() {
        System.out.println("Enter your name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Your name is:" + name);
        try {
            name = scanner.nextLine();
        } catch (InputMismatchException exception) {
            System.out.println("Please enter valid name");
            return initRescuer();
        }
        System.out.println("You entered name");
        return name;
    }
    private void initnameAnimal(){
        System.out.println("Enter animal name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Animal name is:" + name);
        try {
            name = scanner.nextLine();
        } catch (InputMismatchException exception) {
            System.out.println("Please enter valid name");}
          }

     private void showAvailableFood() {

        System.out.println("available food:");

        for (Food food : availableFood) {
            System.out.println(food.getName());
        }
    }

    public void initAnimal(){
         Animal animal = new Animal();
         animal.setName("Rocky");
    }
    private void initFood() {
        Food food = new Food();
        food.setName("Akana");

        Food food1 = new Food();
        food.setName("Royal");

        availableFood.add(food);
        availableFood.add(food1);
    }

    private void initActivities() {
        EntertainmentActivity activity = new EntertainmentActivity();
        activity.setName("run");

        EntertainmentActivity activity1 = new EntertainmentActivity();
        activity.setName("hunting");

        availableActivities[0] = activity;
        availableActivities[1] = activity1;
    }

    private void initrequireFeeding(){
        System.out.println("Feed animal");
        Scanner scanner = new Scanner(System.in);
        String getfood  = scanner.nextLine();
        System.out.println("Your food is" + getAvailableFood());{
            try {
                getfood = scanner.nextLine();
            } catch (InputMismatchException exception) {
                System.out.println("Please enter valid name");}}

                for (Food foodType : availableFood) {
                if (foodType != null) {
                    System.out.println("You could chose other food"); } }

    }


    public void start() {
        initFood();
        initActivities();
        showAvailableFood();
        initAnimal();
        initnameAnimal();
        initrequireFeeding();

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
