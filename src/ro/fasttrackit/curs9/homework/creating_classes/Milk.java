package ro.fasttrackit.curs9.homework.creating_classes;

public class Milk {
    private String type;
    private String flavour;
    private String taste;

    public Milk(String type, String flavour, String taste){
        this.taste = taste;
        this.type = type;
        this.flavour = flavour;
    }

    public String getType() {
        return type;
    }

    public String getTaste() {
        return taste;
    }

    public String getFlavour() {
        return flavour;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }
}
