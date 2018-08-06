package com.lucky.androidshimmer.retrofit;

import com.lucky.androidshimmer.model.Model;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface JSON_Placeholder {

    @GET("photos")
    Observable<List<Model>> getData();
}
