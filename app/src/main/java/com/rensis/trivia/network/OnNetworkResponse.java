package com.rensis.trivia.network;



import com.rensis.trivia.network.serializers.BaseResponse;

import retrofit2.Call;
import retrofit2.Response;

public interface OnNetworkResponse {

    void onSuccess(Call call, Response response, Object tag);

    void onFailure(Call call, BaseResponse response, Object tag);

    //default void statusCode(Call call, Response response, Object tag , int statusCode){}
}
