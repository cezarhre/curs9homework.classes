package ro.fasttrackit.curs9.homework.creating_classes;

public class Pen {
    private String colour;
    private String size;
    private String reservoir;

    public Pen(String colour, String size, String reservoir){
        this.colour = colour;
        this.size = size;
        this.reservoir = reservoir;
    }

    public String getColour() {
        return colour;
    }

    public String getSize() {
        return size;
    }

    public String getReservoir() {
        return reservoir;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setReservoir(String reservoir) {
        this.reservoir = reservoir;
    }
}
