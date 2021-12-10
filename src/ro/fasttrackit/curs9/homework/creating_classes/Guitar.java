package ro.fasttrackit.curs9.homework.creating_classes;

public class Guitar {
    private int strings;
    private String shape;
    private String type;

    public Guitar(int strings, String shape, String type){
        this.type = type;
        this.shape = shape;
        this.strings = strings;
    }

    public String getType() {
        return type;
    }

    public String getShape() {
        return shape;
    }

    public int getStrings() {
        return strings;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public void setStrings(int strings) {
        this.strings = strings;
    }
}
