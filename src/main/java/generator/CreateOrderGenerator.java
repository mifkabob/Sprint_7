package generator;

import org.apache.commons.lang3.RandomStringUtils;
import pojo.CreateOrders;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Random;

public class CreateOrderGenerator {
    public static CreateOrders getNewOrder(List<String> color) {
        CreateOrders createOrders = new CreateOrders();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        createOrders.setFirstName(RandomStringUtils.randomAlphabetic(10));
        createOrders.setLastName(RandomStringUtils.randomAlphabetic(10));
        createOrders.setAddress(RandomStringUtils.randomAlphabetic(10));
        createOrders.setPhone(RandomStringUtils.randomAlphabetic(10));
        createOrders.setDeliveryDate(LocalDate.now().format(formatter));
        createOrders.setComment(RandomStringUtils.randomAlphabetic(10));
        createOrders.setRentTime(new Random().nextInt(19));
        createOrders.setColor(color);
        return createOrders;
    }
}