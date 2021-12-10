package ro.fasttrackit.curs9.homework.creating_classes;

public class Document {
    private int size;
    private String shape;
    private int page;

    public Document(int size, String shape, int page){
        this.size = size;
        this.shape = shape;
        this.page = page;
    }

    public int getPage() {
        return page;
    }

    public int getSize() {
        return size;
    }

    public String getShape() {
        return shape;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }
}
