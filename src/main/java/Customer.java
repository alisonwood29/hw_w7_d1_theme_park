public class Customer extends Person {

    public double wallet;

    public Customer(String name, double height, double wallet) {
        super(name, height);
        this.wallet = wallet;
    }

    public double getWallet() {
        return this.wallet;
    }

    public void pay(double amount) {
        this.wallet -= amount;
    }
}
