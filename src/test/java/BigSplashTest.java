import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BigSplashTest {

    BigSplash bigSplash;
    Customer customer;

    @Before
    public void before(){
        bigSplash = new BigSplash(8, 1.05);
        customer = new Customer("Peter", 1.85, 50);
    }

    @Test
    public void hasPrice(){
        assertEquals(8, bigSplash.getPrice(), 0);
    }

    @Test
    public void hasMinHeight(){
        assertEquals(1.05, bigSplash.getMinHeight(), 0);
    }

    @Test
    public void canStart(){
        assertEquals("Turning on water", bigSplash.startRide());
    }

    @Test
    public void canStop(){
        assertEquals("Turning off water", bigSplash.stopRide());
    }

    @Test
    public void bigSplashStartsEmpty(){
        assertEquals(0, bigSplash.customerCount());
    }

    @Test
    public void canAddCustomerToRide(){
        bigSplash.addCustomer(customer);
        assertEquals(1, bigSplash.customerCount());
        assertEquals(42, customer.getWallet(), 0.1);
    }

    @Test
    public void cantAddCustomerIfUnderHeight(){
        Customer newCustomer = new Customer("Alison", 1.00, 30);
        bigSplash.addCustomer(newCustomer);
        assertEquals(0, bigSplash.customerCount());
        assertEquals(30, newCustomer.getWallet(), 0.1);
    }

    @Test
    public void customerCantGetOnRideIfNotEnoughMoney(){
        Customer newCustomer = new Customer("Alison", 1.20, 5);
        bigSplash.addCustomer(newCustomer);
        assertEquals(0, bigSplash.customerCount());
        assertEquals(5, newCustomer.getWallet(), 0.1);
    }

}
