package ro.fasttrackit.curs9.homework.creating_classes;

public class Book {
    private int page;
    private String size;
    private String colour;

    public Book(int page, String size, String colour){
        this.page = page;
        this.size = size;
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public int getPage() {
        return page;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setPage(int page) {
        this.page = page;
    }
}
