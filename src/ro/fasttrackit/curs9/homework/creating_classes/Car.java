package ro.fasttrackit.curs9.homework.creating_classes;

public class Car {
    private String engine;
    private String wheel;
    private String chassis;

    public Car(String engine, String chassis, String wheel){
        this.engine = engine;
        this.chassis = chassis;
        this.wheel = wheel;
    }

    public String getChassis() {
        return chassis;
    }

    public String getEngine() {
        return engine;
    }

    public String getWheel() {
        return wheel;
    }

    public void setChassis(String chassis) {
        this.chassis = chassis;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setWheel(String wheel) {
        this.wheel = wheel;
    }
}
