package ro.fasttrackit.curs9.homework.creating_classes;

public class ToothBrush {
    private String type;
    private int size;
    private String colour;

    public ToothBrush(String type, int size, String colour){
        this.colour = colour;
        this.type = type;
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public String getColour() {
        return colour;
    }

    public int getSize() {
        return size;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
