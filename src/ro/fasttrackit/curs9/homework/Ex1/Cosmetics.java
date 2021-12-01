package ro.fasttrackit.curs9.homework.Ex1;

public class Cosmetics extends Product {
    private String colour;
    private int weight;

    public Cosmetics(String colour, int weight) {
        super();
        this.colour = colour;
        this.weight = weight;
    }

    public Cosmetics(String colour, String name, int price){
        this.name = "Shampoo";
        this.price = 6;
    }

    public int getWeight() {
        return weight;
    }

    public String getColour() {
        return "black";
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
