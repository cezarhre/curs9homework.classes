package ro.fasttrackit.curs9.homework.creating_classes;

public class Bike {
    private int wheels;
    private int gear;
    private String chair;

    public Bike(int wheels,int gear, String chair){
        this.chair = chair;
        this.gear = gear;
        this.wheels = wheels;
    }

    public int getGear() {
        return gear;
    }

    public int getWheels() {
        return wheels;
    }

    public String getChair() {
        return chair;
    }
}
