package ro.fasttrackit.curs9.homework.creating_classes;

public class Animal {
    private int legs;
    private String colour;
    private String breed;

    public Animal(int legs, String colour, String breed){
        this.legs = legs;
        this.colour = colour;
        this.breed = breed;
    }

    public String getColour() {
        return colour;
    }

    public int getLegs() {
        return legs;
    }

    public String getBreed() {
        return breed;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }
}
