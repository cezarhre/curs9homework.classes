package ro.fasttrackit.curs9.homework.creating_classes;

public class Classroom {
    private int bank;
    private String blackboard;
    private String table;

    public Classroom(int bank, String table, String blackboard){
        this.bank = bank;
        this.blackboard = blackboard;
        this.table = table;
    }

    public int getBank() {
        return bank;
    }

    public String getBlackboard() {
        return blackboard;
    }

    public String getTable() {
        return table;
    }

    public void setBank(int bank) {
        this.bank = bank;
    }

    public void setBlackboard(String blackboard) {
        this.blackboard = blackboard;
    }

    public void setTable(String table) {
        this.table = table;
    }
}
