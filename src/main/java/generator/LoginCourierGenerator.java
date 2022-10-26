package generator;

import pojo.CreateCourier;
import pojo.LoginCourier;

//возращает объект кредов курьера, которого принимает
public class LoginCourierGenerator {
    public static LoginCourier from(CreateCourier createCourier) {
        return new LoginCourier(createCourier.getLogin(), createCourier.getPassword());
    }
}