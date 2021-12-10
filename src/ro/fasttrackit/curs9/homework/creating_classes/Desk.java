package ro.fasttrackit.curs9.homework.creating_classes;

public class Desk {
    private int drawer;
    private int door;
    private String surface;

    public Desk(int drawer, int door, String surface){
        this.door = door;
        this.drawer = drawer;
        this.surface = surface;
    }

    public int getDoor() {
        return door;
    }

    public int getDrawer() {
        return drawer;
    }

    public String getSurface() {
        return surface;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    public void setDrawer(int drawer) {
        this.drawer = drawer;
    }

    public void setSurface(String surface) {
        this.surface = surface;
    }
}
