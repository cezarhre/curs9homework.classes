package ro.fasttrackit.curs9.homework.creating_classes;

public class Flashlight {
    private String colour;
    private int led;
    private int size;

    public Flashlight(String colour, int led, int size){
        this.colour = colour;
        this.led = led;
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public String getColour() {
        return colour;
    }

    public int getLed() {
        return led;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setLed(int led) {
        this.led = led;
    }
}
