package ro.fasttrackit.curs9.homework.creating_classes;

public class File {
    private int size;
    private String type;
    private String name;

    public File(int size, String type, String name){
        this.name = name;
        this.type = type;
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }
}
