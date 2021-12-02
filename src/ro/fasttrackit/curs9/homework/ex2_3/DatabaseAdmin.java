package ro.fasttrackit.curs9.homework.ex2_3;

public class DatabaseAdmin extends Employee {
    protected String databaseTechnology;

    public DatabaseAdmin() {
        super();
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
