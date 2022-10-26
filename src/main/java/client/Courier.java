package client;

import io.qameta.allure.Step;
import io.restassured.response.Response;
import pojo.CreateCourier;
import pojo.CreateOrders;
import pojo.LoginCourier;

import static io.restassured.RestAssured.given;

public class Courier extends RestClient {     // В этом классе я создаю методы в апи

    private static final String COURIER = "courier";
    private static final String COURIER_LOGIN = "courier/login";
    private static final String ORDERS = "orders";

    @Step("Создать курьера")
    public static Response createNewCourier(CreateCourier body) { //создание нового курьера
        return given().log().all()
                .spec(getDefaultRequestSpec())
                .body(body)
                .when()
                .post(COURIER);
    }

    @Step("Проверка авторизации курьера")
    public static Response courierAuthorization(LoginCourier body) { //авторизация курьера
        return given().log().all()
                .spec(getDefaultRequestSpec())
                .body(body)
                .when()
                .post(COURIER_LOGIN);
    }

    @Step("Проверка создания заказа")
    public static Response createNewOrders(CreateOrders body) { //создание нового заказа
        return given()
                .spec(getDefaultRequestSpec())
                .body(body)
                .when()
                .post(ORDERS);
    }
}