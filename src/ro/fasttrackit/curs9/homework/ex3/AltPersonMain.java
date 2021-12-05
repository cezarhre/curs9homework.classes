package ro.fasttrackit.curs9.homework.ex3;

import ro.fasttrackit.curs9.homework.ex2_3.Employee;

import java.time.LocalDate;

public class AltPersonMain {
    public static void main(String[] args) {
        Employee altPerson = new Employee(LocalDate.of(2019,1,1),"Helpdesk",
                "JOHNSON","JOHN",LocalDate.of(1996,6,4),"Bu");
        AltPerson altPerson1 = new AltPerson(altPerson);
        System.out.println("Full name: "+altPerson1.getFullName());
        System.out.println("Age: "+altPerson1.getYear()+" years old");
        System.out.println("Age at Employment "+altPerson1.getAgeAtEmployment()+" years old");

    }
}
