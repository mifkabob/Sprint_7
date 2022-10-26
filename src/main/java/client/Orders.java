package client;

import io.qameta.allure.Step;
import io.restassured.response.Response;
import pojo.CreateCourier;
import pojo.CreateOrders;

import static io.restassured.RestAssured.given;

public class Orders extends RestClient {

    private static final String ORDERS = "orders";

    @Step("Создание заказа")
    public static Response createNewOrders(CreateOrders body) {
        return given().log().all()
                .spec(getDefaultRequestSpec())
                .body(body)
                .when()
                .post(ORDERS);
    }

    @Step("Получение списка заказов")
    public static Response getListOrders() {
        return given().log().all()
                .spec(getDefaultRequestSpec())
                .when()
                .get(ORDERS);
    }
}