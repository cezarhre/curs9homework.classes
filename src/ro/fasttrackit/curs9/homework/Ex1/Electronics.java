package ro.fasttrackit.curs9.homework.Ex1;

public class Electronics extends Product{
    private String type;
    private double length;
    private double width;
    private double height;
    private double weight;

    public Electronics(){
        super.getName();
        this.type = "TV";
        this.length = 15.5;
        this.width = 7.4;
        this.height = 10.5;
        this.weight = 14.8;
    }

    public String getType() {
        return "Video";
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
        if(length > 5 && length < 10){
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
}
