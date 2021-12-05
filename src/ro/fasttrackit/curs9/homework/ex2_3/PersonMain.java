package ro.fasttrackit.curs9.homework.ex2_3;

import java.time.LocalDate;
import java.time.Period;

public class PersonMain {
    public static void main(String[] args) {
        Employee person = new Employee (LocalDate.of(2020,11,10), "helpdesk",
                "IONESCU","ION", LocalDate.of(1995,10,10), "National Street");
        DatabaseAdmin dbPerson = new DatabaseAdmin("Data base",LocalDate.of(2020,5,4),
                "Data Operator","Popescu", "Pop",LocalDate.of(1995,10,11),
                "Oradea");

        System.out.println("Full Name "+person.getFirstName()+" "+person.getLastName());
        System.out.println("Age at Employment "+person.getAge()+" years old");
        System.out.println("Age "+ Period.between(person.getBirthday(), LocalDate.now()).getYears()+" years old");

        Programmer program = new Programmer("English",LocalDate.of(2019,6,4),
                "Programmer","Cristescu","Cristi",LocalDate.of(1991,7,3),
                "Salaj");

        System.out.println(dbPerson.getAddress());

    }
}
