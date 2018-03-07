package ru.com.penza.lesson13.datasources;

import java.util.List;


import io.reactivex.Observable;
import retrofit2.http.GET;
import ru.com.penza.lesson13.datamodel.Person;


/**
 * Created by Константин on 05.03.2018.
 */

public interface RxService {

    @GET("/lesson11.json?key=e2356920")
    Observable<List<Person>> getAnswers();
}
