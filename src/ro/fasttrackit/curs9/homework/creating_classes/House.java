package ro.fasttrackit.curs9.homework.creating_classes;

public class House {
    private int floor;
    private int window;
    private String roof;

    public House(int floor, int window, String roof){
        this.floor = floor;
        this.window = window;
        this.roof = roof;
    }

    public int getFloor() {
        return floor;
    }

    public int getWindow() {
        return window;
    }

    public String getRoof() {
        return roof;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public void setWindow(int window) {
        this.window = window;
    }
}
