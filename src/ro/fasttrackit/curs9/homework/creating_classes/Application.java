package ro.fasttrackit.curs9.homework.creating_classes;

public class Application {
    private int size;
    private String name;

    public Application(int size, String name){
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
