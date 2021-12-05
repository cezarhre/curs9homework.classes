package ro.fasttrackit.curs9.homework.ex1;

public class Electronics extends Product {
    protected String type;
    protected double length;
    protected double width;
    protected double height;
    protected double weight;

    public Electronics(int price, String name, String description, int quantity,
                       String type, double length, double width, double height, double weight) {
        super(price, name, description, quantity);
        this.type = type;
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double setLength(double length) {
        if (length > 5 && length < 10) {
            length = 10;
        }
        return length;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String toString() {
        return "Name " + this.name + " Price " + this.price;
    }
}
