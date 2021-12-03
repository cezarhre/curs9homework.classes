package ro.fasttrackit.curs9.homework.ex2_3;

import java.time.LocalDate;

public class Programmer extends Employee{

    protected String language;

    public Programmer() {
        super(LocalDate.of(2019,8,9),"operator","Ionescu","Ion",LocalDate.of(1990,5,11),"B-dul 1 Dec");
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
