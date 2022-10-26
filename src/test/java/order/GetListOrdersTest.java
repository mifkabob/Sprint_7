package order;

import client.Orders;
import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import io.restassured.response.Response;
import org.junit.Test;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.hasSize;

public class GetListOrdersTest {

    @Test
    @DisplayName("Получение списка зааказов")
    @Description("Ожидаемый код ответа: 200")
    public void GetListOrders() {
        Response listOfOrder = Orders.getListOrders();
        listOfOrder.then()
                .statusCode(200)
                .and()
                .body("orders", hasSize(greaterThan(0)));
    }
}