package org.fasttrackit;

public class CatFood extends Food {

    private static String Name;
    private String Flavor;

    public static String getName() {
        return Name;
    }

    public String setName(String name) {
        return Name;
        }

    public String getFlavor() {
        return Flavor;
    }

    public void setFlavor(String flavor) {
        Flavor = flavor;
    }
}
