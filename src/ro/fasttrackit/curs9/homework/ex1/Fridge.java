package ro.fasttrackit.curs9.homework.ex1;

public class Fridge extends Electronics {
    private double temperature;


    public Fridge(int price, String name, String description, int quantity,double temperature, String type, double length, double width, double height, double weight) {
        super(price, name, description, quantity, type, length, width, height, weight);
        this.temperature = temperature;
        this.name = "Small refrigerator";
        this.height = 100.25;
        this.length = 50.35;
        this.width = 40.60;
    }

    public double getTemperature() {
        return temperature;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;

    }

    public String setTemperature() {
        if (this.temperature < 0) {
            return "frozen";
        } else if (this.temperature > 0 && this.temperature < 10) {
            return "cold";
        }
        return "hot";
    }

    public String toString() {
        return this.name + " Height: " + this.height + " cm " + " Length: " + this.length + " cm " + " Width: " + this.width + " cm";
    }
}

