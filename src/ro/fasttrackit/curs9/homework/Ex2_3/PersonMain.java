package ro.fasttrackit.curs9.homework.Ex2_3;

public class PersonMain {
    public static void main(String[] args) {
        Employee person = new Employee();
        System.out.println("Full Name "+person.getFirstName()+" "+person.getLastName());
        System.out.println("Age "+person.getAge());

        Programmer program = new Programmer();
        System.out.println(program.getPosition());

        DatabaseAdmin admin = new DatabaseAdmin();
        System.out.println(admin.getAddress());

    }
}
