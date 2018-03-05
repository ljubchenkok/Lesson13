package ru.com.penza.lesson12.datasources;

import retrofit2.http.GET;

import java.util.List;

import retrofit2.Call;
import ru.com.penza.lesson12.datamodel.Contact;
import ru.com.penza.lesson12.datamodel.Person;


public interface SOService {


    @GET("/lesson11.json?key=e2356920")
    Call<List<Person>> getAnswers();


}
