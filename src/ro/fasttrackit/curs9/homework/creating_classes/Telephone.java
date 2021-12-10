package ro.fasttrackit.curs9.homework.creating_classes;

public class Telephone {
    private String microphone;
    private String receptor;
    private String type;

    public Telephone(String microphone, String receptor, String type){
        this.microphone = microphone;
        this.receptor = receptor;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String getMicrophone() {
        return microphone;
    }

    public String getReceptor() {
        return receptor;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setMicrophone(String microphone) {
        this.microphone = microphone;
    }

    public void setReceptor(String receptor) {
        this.receptor = receptor;
    }
}
