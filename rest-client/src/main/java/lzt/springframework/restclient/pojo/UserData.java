package lzt.springframework.restclient.pojo;

import java.util.List;

public class UserData {
    private List<User> data;

    public List<User> getData() {
        return data;
    }

    public void setData(List<User> data) {
        this.data = data;
    }
}
