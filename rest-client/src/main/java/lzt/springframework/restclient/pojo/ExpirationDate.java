package lzt.springframework.restclient.pojo;

import java.io.Serializable;

public class ExpirationDate implements Serializable {
    private final static long serialVersionUID = 4661228813349752965L;
    private String date;
    private Integer timezoneType;
    private String timezone;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getTimezoneType() {
        return timezoneType;
    }

    public void setTimezoneType(Integer timezoneType) {
        this.timezoneType = timezoneType;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }
}
