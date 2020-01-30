package snackBarApp;

public class Snack {

    public static int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vMachineId;

    public Snack(String name, int quantity, double cost, int vMachineId) {
        this.id = ++maxId;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vMachineId = vMachineId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getVMachineId() {
        return this.vMachineId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void addQuantity(int quantity) {
        this.quantity += quantity;
    }

    public void buySnack(int quantity) {
        this.quantity -= quantity;
    }

    public double getTotalCost(int quantity) {
        return quantity * this.cost;
    }
}