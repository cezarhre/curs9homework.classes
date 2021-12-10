package ro.fasttrackit.curs9.homework.creating_classes;

public class OperatingSystem {
    private int size;
    private String design;
    private int folder;

    public OperatingSystem(int size, String design, int folder){
        this.size = size;
        this.design = design;
        this.folder = folder;
    }

    public int getSize() {
        return size;
    }

    public int getFolder() {
        return folder;
    }

    public String getDesign() {
        return design;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setDesign(String design) {
        this.design = design;
    }

    public void setFolder(int folder) {
        this.folder = folder;
    }
}
