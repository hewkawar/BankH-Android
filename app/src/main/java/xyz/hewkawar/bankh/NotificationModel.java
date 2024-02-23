package xyz.hewkawar.bankh;
import com.google.gson.annotations.SerializedName;

public class NotificationModel {
    @SerializedName("type")
    private String type;

    @SerializedName("amount")
    private double amount;

    @SerializedName("time")
    private long time;

    @SerializedName("time_formatted")
    private String timeFormatted;

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public long getTime() {
        return time;
    }

    public String getTimeFormatted() {
        return timeFormatted;
    }
}
