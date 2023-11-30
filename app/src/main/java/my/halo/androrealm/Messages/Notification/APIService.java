package my.halo.androrealm.Messages.Notification;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {

    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAub52IC4:APA91bFs14OZU2CdEYCLNcdV1eekSaFkYSE6M1ouqGwPUNDerb4lVFCLkXJSeh6ulpaKPdLaf_N-hfw7gGZfr-UsaAgkWGElktl10Kr80k6CLbQDunbq2ofVK9jWvMWKh3S3LX65MhuA"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body NotificationSender body);


}
