package ro.fasttrackit.curs9.homework.creating_classes;

public class Chair {
    private int leg;
    private String backrest;
    private String seat;

    public Chair(int leg, String backrest, String seat){
        this.leg = leg;
        this.backrest = backrest;
        this.seat = seat;
    }

    public int getLeg() {
        return leg;
    }

    public String getBackrest() {
        return backrest;
    }

    public String getSeat() {
        return seat;
    }

    public void setBackrest(String backrest) {
        this.backrest = backrest;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }
}
