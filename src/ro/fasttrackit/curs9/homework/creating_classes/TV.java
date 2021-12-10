package ro.fasttrackit.curs9.homework.creating_classes;

public class TV {
    private String display;
    private String type;
    private int size;

    public TV(String display, String type, int size){
        this.size = size;
        this.type = type;
        this.display = display;
    }

    public int getSize() {
        return size;
    }

    public String getType() {
        return type;
    }

    public String getDisplay() {
        return display;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDisplay(String display) {
        this.display = display;
    }
}
