/*
 * Copyright (C) Marina Meier, The Bachelor Degree
 */

package com.google.android.gms.samples.vision.barcodereader;

import com.google.android.gms.samples.vision.barcodereader.Model.Country;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;

public interface Api {
    @GET("/{url}") void getCountriesInfo(@Path("url") String url, Callback<List<Country>> callback);
}
