package ro.fasttrackit.curs9.homework.ex2_3;

import java.time.LocalDate;

public class PersonMain {
    public static void main(String[] args) {
        Employee person = new Employee(LocalDate.of(2020,11,10), "helpdesk",
                "POPESCU","ION", LocalDate.of(1995,10,10), "National Street");
        System.out.println("Full Name "+person.getFirstName()+" "+person.getLastName());
        System.out.println("Age at Employment "+person.getAge());

        Programmer program = new Programmer();
        System.out.println("New position " + program.getPosition());
        System.out.println("Language request for new position " + program.getLanguage());

        DatabaseAdmin admin = new DatabaseAdmin();
        System.out.println("Job request " + admin.getDatabaseTechnology());
        System.out.println(admin.getAddress());

    }
}
