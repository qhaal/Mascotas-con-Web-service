package com.developer.albert.mascotas.restApi;


import com.developer.albert.mascotas.restApi.model.MascotaResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by anahisalgado on 25/05/16.
 */
public interface EndpointsApi {

    @GET(ConstantesRestApi.URL_GET_RECENT_MEDIA_USER)
    Call<MascotaResponse> getRecentMedia();


    @GET(ConstantesRestApi.URL_FINAL_SEARCH)
    Call<MascotaResponse> getRecentMediaBusqueda(@Query("q") String perfil);


    @GET(ConstantesRestApi.URL_FINAL_MEDIA_BY_ID)
    Call<MascotaResponse> getRecentMediaByID(@Path("user-id") String id);

}
