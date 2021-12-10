package ro.fasttrackit.curs9.homework.creating_classes;

public class RemoteControl {
    private String colour;
    private int button;
    private String shape;

    public RemoteControl(String colour, int button, String shape){
        this.button = button;
        this.colour = colour;
        this.shape = shape;
    }

    public String getColour() {
        return colour;
    }

    public String getShape() {
        return shape;
    }

    public int getButton() {
        return button;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public void setButton(int button) {
        this.button = button;
    }
}
