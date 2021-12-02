package ro.fasttrackit.curs9.homework.ex2_3;

public class Programmer extends Employee{

    protected String language;

    public Programmer() {
        super();
        this.language = "English";
    }

    public String getLanguage() {
        return language;
    }

    @Override
    public String getPosition() {
        return "Programmer";
    }
}
