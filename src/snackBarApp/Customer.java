package snackBarApp;

class Customer {

    private static int maxId = 0;
    int id;
    String name;
    double cash;

    public Customer(String name, double cash) {

        id = ++ maxId;
        this.name = name;
        this.cash = cash;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCash() {
        return cash;
    }

    public void addCash(double cash) {
        this.cash += cash;
    }

    public void buy(double cash) {
        this.cash -= cash;
    }
}