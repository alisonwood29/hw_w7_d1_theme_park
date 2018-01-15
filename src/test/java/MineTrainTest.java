import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MineTrainTest {

    MineTrain mineTrain;
    Customer customer;

    @Before
    public void before(){
        mineTrain = new MineTrain(12, 1.20);
        customer = new Customer("Hazel", 1.58, 60);
    }

    @Test
    public void hasPrice(){
        assertEquals(12, mineTrain.getPrice(), 0);
    }

    @Test
    public void hasMinHeight(){
        assertEquals(1.20, mineTrain.getMinHeight(), 0);
    }

    @Test
    public void canStart(){
        assertEquals("Starting train", mineTrain.startRide());
    }

    @Test
    public void canStop(){
        assertEquals("Stopping train", mineTrain.stopRide());
    }

    @Test
    public void mineTrainStartsEmpty(){
        assertEquals(0, mineTrain.customerCount());
    }

    @Test
    public void canAddCustomerToRide(){
        mineTrain.addCustomer(customer);
        assertEquals(1, mineTrain.customerCount());
    }

    @Test
    public void cantAddCustomerIfUnderHeight(){
        Customer newCustomer = new Customer("Alison", 1.00, 30);
        mineTrain.addCustomer(newCustomer);
        assertEquals(0, mineTrain.customerCount());
        assertEquals(30, newCustomer.getWallet(), 0.1);
    }

    @Test
    public void customerCantGetOnRideIfNotEnoughMoney(){
        Customer newCustomer = new Customer("Alison", 1.20, 5);
        mineTrain.addCustomer(newCustomer);
        assertEquals(0, mineTrain.customerCount());
        assertEquals(5, newCustomer.getWallet(), 0.1);
    }
}
