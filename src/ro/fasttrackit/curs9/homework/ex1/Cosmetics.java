package ro.fasttrackit.curs9.homework.ex1;

public class Cosmetics extends Product {
    private String colour;
    private int weight;

    public Cosmetics(String name, int price, String description, int quantity, String colour, int weight) {
        super(price, name, description, quantity);
        this.colour = colour;
        this.weight = weight;
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
