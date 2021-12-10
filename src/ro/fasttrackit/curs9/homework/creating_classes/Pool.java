package ro.fasttrackit.curs9.homework.creating_classes;

public class Pool {
    private int size;
    private String colour;
    private int depth;

    public Pool(int size, String colour, int depth){
        this.colour = colour;
        this.depth = depth;
        this.size = size;
    }

    public String getColour() {
        return colour;
    }

    public int getSize() {
        return size;
    }

    public int getDepth() {
        return depth;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }
}
