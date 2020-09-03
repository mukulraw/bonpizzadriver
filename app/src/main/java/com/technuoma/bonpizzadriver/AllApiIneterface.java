package com.technuoma.bonpizzadriver;


import com.technuoma.bonpizzadriver.deliveryDetailsPOJO.deliveryDetailsBean;
import com.technuoma.bonpizzadriver.loginPOJO.loginBean;
import com.technuoma.bonpizzadriver.ordersPOJO.ordersBean;

import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface AllApiIneterface {

    @Multipart
    @POST("pizza/api/login3.php")
    Call<loginBean> login(
            @Part("username") String username,
            @Part("password") String password,
            @Part("token") String token
    );

    @Multipart
    @POST("pizza/api/getOngoingDeliveries.php")
    Call<ordersBean> getOngoingDeliveries(
            @Part("id") String id
    );

    @Multipart
    @POST("pizza/api/getCompletedDeliveries.php")
    Call<ordersBean> getCompletedDeliveries(
            @Part("id") String id
    );

    @Multipart
    @POST("pizza/api/getDeliveryDetails.php")
    Call<deliveryDetailsBean> getDeliveryDetails(
            @Part("id") String id
    );

    @Multipart
    @POST("pizza/api/changeDeliveryStatus.php")
    Call<deliveryDetailsBean> changeDeliveryStatus(
            @Part("id") String id,
            @Part("status") String status
    );

    @Multipart
    @POST("pizza/api/addLogs.php")
    Call<deliveryDetailsBean> addLogs(
            @Part("delivery_id") String delivery_id,
            @Part("order_id") String order_id,
            @Part("lat") String lat,
            @Part("lng") String lng
    );

}
