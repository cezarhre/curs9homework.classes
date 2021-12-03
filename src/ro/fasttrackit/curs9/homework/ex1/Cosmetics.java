package ro.fasttrackit.curs9.homework.ex1;

public class Cosmetics extends Product {
    private String colour;
    private int weight;

    public Cosmetics(String name, int price, String colour, int weight) {
        super(10, "Palmolive", "For Women", 3);
        this.colour = colour;
        this.weight = weight;
        this.name = "Shower gel";
        this.quantity = 10;

    }

    public int getWeight() {
        return weight;
    }

    public String getColour() {
        return colour;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String toString() {
        return "Name " + this.name + " Quantity " + this.quantity;
    }
}
