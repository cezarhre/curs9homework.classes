package ro.fasttrackit.curs9.homework.Ex1;

public class Fridge extends Electronics {
    private double temperature;

    Fridge(double temperature) {
        this.temperature = temperature;

    }

    public double getTemperature() {
        return temperature;
    }

    public String setTemperature() {
        if (this.temperature < 0) {
            return "frozen";
        } else if (this.temperature > 0 && this.temperature < 10) {
            return "cold";
        }
        return "hot";
    }
}

