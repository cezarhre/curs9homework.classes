package ro.fasttrackit.curs9.homework.ex2_3;

import java.time.LocalDate;

public class DatabaseAdmin extends Employee {
    private String dbTechnology;

    public DatabaseAdmin(String dbTechnology, LocalDate dateOfEmployment,String position,
                         String fName, String lName, LocalDate birthday, String address) {
        super(dateOfEmployment,position,fName,lName,birthday,address);
        this.dbTechnology = dbTechnology;
    }

    public String getDbTechnology() {
        return dbTechnology;
    }

    @Override
    public String getAddress() {
        return "DB admin " + super.getAddress();
    }
}
