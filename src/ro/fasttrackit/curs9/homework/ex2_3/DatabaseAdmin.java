package ro.fasttrackit.curs9.homework.ex2_3;

import java.time.LocalDate;

public class DatabaseAdmin extends Employee {
    private String databaseTechnology;

    public DatabaseAdmin() {
        super(LocalDate.of(2020,10,1),"Operator","Ionescu","Ion",LocalDate.of(1990,4,3),"Calea 1 Mai");
        this.databaseTechnology = "DataBase";
    }

    public String getDatabaseTechnology() {
        return databaseTechnology;
    }

    @Override
    public String getAddress() {
        return "DB admin " + super.getAddress();
    }
}
