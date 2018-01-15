import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;

    @Before
    public void before(){
        customer = new Customer("Alison", 1.52, 30);
    }

    @Test
    public void hasName(){
        assertEquals("Alison", customer.getName());
    }

    @Test
    public void hasHeight(){
        assertEquals(1.52, customer.getHeight(), 0);
    }

    @Test
    public void hasWallet(){
        assertEquals(30, customer.getWallet(), 0.1);
    }

    @Test
    public void canPay(){
        customer.pay(10);
        assertEquals(20, customer.getWallet(), 0.1);
    }
}
