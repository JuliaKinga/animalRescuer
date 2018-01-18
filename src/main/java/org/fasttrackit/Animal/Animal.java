package org.fasttrackit.Animal;

public class Animal{

    public String animal;
    private String gender;
    public String favoriteFoodName;
    public String favoriteActivityName;
    public String name;
    public double hungerLevel;
    public int happinessLevel;
    public String activity;

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public double getHungerLevel() {
        return hungerLevel;
    }

    public void setHungerLevel(double hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFavoriteFoodName() {
        return favoriteFoodName;
    }

    public void setFavoriteFoodName(String favoriteFoodName) {
        this.favoriteFoodName = favoriteFoodName;
    }

    public String getFavoriteActivityName() {
        return favoriteActivityName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFavoriteActivityName(String favoriteActivityName) {
        this.favoriteActivityName = favoriteActivityName;


    }
}
