package ru.com.penza.lesson12.datasources;


public class ApiUtils {

    public static final String BASE_URL = "https://my.api.mockaroo.com";

    public static SOService getSOService() {
        return RetrofitClient.getClient(BASE_URL).create(SOService.class);
    }
}

