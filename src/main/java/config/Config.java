package config;

public class Config {   //В этом классе вынес URL, чтобы сократить код

    private static final String BASE_URL = "http://qa-scooter.praktikum-services.ru/api/v1";

    public static String getBaseUrl() {
        return BASE_URL;
    }
}