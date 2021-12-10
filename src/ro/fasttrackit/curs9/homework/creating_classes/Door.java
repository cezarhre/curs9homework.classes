package ro.fasttrackit.curs9.homework.creating_classes;

public class Door {
    private String colour;
    private String size;
    private String handle;

    public Door(String colour, String size, String handle){
        this.colour = colour;
        this.handle = handle;
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public String getColour() {
        return colour;
    }

    public String getHandle() {
        return handle;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }
}
