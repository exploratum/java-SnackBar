package snackBarApp;

public class VMachine {

    private static int maxId = 0;
    private int id;
    private String name;

    public VMachine(int id, String name) {
        this.id = ++maxId;
        this.name = name;
    }

    public int getiD() {
        return id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}