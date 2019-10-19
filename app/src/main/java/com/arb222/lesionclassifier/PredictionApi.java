package com.arb222.lesionclassifier;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface PredictionApi {
    @Multipart
    @POST("predict")
    Call<Output> createPost(@Part MultipartBody.Part image);
}
