package ro.fasttrackit.curs9.homework.creating_classes;

public class Coffee {
    private String size;
    private String taste;
    private String flavour;

    public Coffee(String size,String flavour, String taste){
        this.taste = taste;
        this.flavour = flavour;
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public String getFlavour() {
        return flavour;
    }

    public String getTaste() {
        return taste;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }
}

