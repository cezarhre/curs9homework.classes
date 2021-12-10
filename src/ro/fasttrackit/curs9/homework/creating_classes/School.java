package ro.fasttrackit.curs9.homework.creating_classes;

public class School {
    private int classroom;
    private String type;
    private String laboratory;

    public School(int classroom, String type, String laboratory){
        this.classroom = classroom;
        this.type = type;
        this.laboratory = laboratory;
    }

    public String getType() {
        return type;
    }

    public int getClassroom() {
        return classroom;
    }

    public String getLaboratory() {
        return laboratory;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setClassroom(int classroom) {
        this.classroom = classroom;
    }

    public void setLaboratory(String laboratory) {
        this.laboratory = laboratory;
    }
}
