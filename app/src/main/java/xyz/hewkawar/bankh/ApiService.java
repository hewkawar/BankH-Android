package xyz.hewkawar.bankh;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("app/bank/notification/get")
    Call<List<NotificationModel>> getNotifications();
}