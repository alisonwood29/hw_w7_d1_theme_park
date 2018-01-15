import java.util.ArrayList;

public abstract class Ride {

    public double price;
    public double minHeight;
    public ArrayList<Customer> customers;

    public Ride(double price, double minHeight){
        this.price = price;
        this.minHeight = minHeight;
        this.customers = new ArrayList<>();
    }

    public double getPrice() {
        return this.price;
    }

    public double getMinHeight() {
        return this.minHeight;
    }

    public abstract String startRide();

    public abstract String stopRide();

    public int customerCount() {
        return this.customers.size();
    }

    public void addCustomer(Customer customer) {
        if(customer.getHeight() >= this.minHeight && customer.getWallet() >= this.price) {
            this.customers.add(customer);
            customer.pay(this.price);
        }
    }
}
