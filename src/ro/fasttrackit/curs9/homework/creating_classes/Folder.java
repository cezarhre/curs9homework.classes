package ro.fasttrackit.curs9.homework.creating_classes;

public class Folder {
    private int files;
    private String name;
    private int size;

    public Folder(int files, String name, int size){
        this.files = files;
        this.name = name;
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public int getFiles() {
        return files;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFiles(int files) {
        this.files = files;
    }
}
