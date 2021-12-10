package ro.fasttrackit.curs9.homework.creating_classes;

public class User {
    private String name;
    private String pattern;
    private int password;

    public User(String name, String pattern, int password){
        this.password = password;
        this.pattern = pattern;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPassword() {
        return password;
    }

    public String getPattern() {
        return pattern;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }
}
