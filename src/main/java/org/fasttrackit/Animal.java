package org.fasttrackit;

public class Animal{

    private String gender;
    public String favoriteFoodName;
    public String favoriteActivityName;
    public String name;
    public double hungerLevel;
    public String happinessLevel;

    public String getHappinessLevel() {
        return happinessLevel;
    }

    public void setHappinessLevel(String happinessLevel) {
        this.happinessLevel = happinessLevel;
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
