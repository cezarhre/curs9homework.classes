package ro.fasttrackit.curs9.homework.creating_classes;

public class Laptop {
    private String display;
    private String keyboard;
    private String processor;

    public Laptop(String display, String keyboard, String processor) {
            this.display =  display;
            this.keyboard = keyboard;
            this.processor = processor;
    }

    public String getDisplay() {
        return display;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public String getProcessor() {
        return processor;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }
}
