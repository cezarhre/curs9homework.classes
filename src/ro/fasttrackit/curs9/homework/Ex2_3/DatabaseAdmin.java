package ro.fasttrackit.curs9.homework.Ex2_3;

public class DatabaseAdmin extends Employee {
    private String databaseTechnology;

    public DatabaseAdmin() {
        this.databaseTechnology = databaseTechnology;
    }

    public String getDatabaseTechnology() {
        return databaseTechnology;
    }

    @Override
    public String getAddress() {
        return "DB admin " + super.getAddress();
    }
}
