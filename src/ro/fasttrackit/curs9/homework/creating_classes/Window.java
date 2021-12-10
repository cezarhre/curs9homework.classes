package ro.fasttrackit.curs9.homework.creating_classes;

public class Window {
    private String frame;
    private String type;
    private int size;

    public Window(String frame, String type, int size){
        this.frame = frame;
        this.type = type;
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public int getSize() {
        return size;
    }

    public String getFrame() {
        return frame;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }
}
