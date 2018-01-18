package org.fasttrackit.Food;

import org.fasttrackit.Food.Food;

public class DogFood extends Food {


    private double quantity;
    private String flavor;
    private String type;
    private String packaging;

    public DogFood(String name) {
        this.name = name;

    }
    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPackaging() {
        return packaging;
    }

    public void setPackaging(String packaging) {
        this.packaging = packaging;
    }

}
