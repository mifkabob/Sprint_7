package courier;

import client.Courier;
import org.junit.Before;

public class CourierBaseTest {
    private Courier courier;

    @Before
    public void setUpCourier() {
        courier = new Courier();
    }

}