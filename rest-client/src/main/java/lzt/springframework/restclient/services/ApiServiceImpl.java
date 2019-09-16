package lzt.springframework.restclient.services;

import lzt.springframework.restclient.pojo.User;
import lzt.springframework.restclient.pojo.UserData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ApiServiceImpl implements ApiService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public List<User> getUsers(Integer limit) {
        UserData userData = restTemplate.getForObject("https://private-anon-a1ae473ace-apifaketory.apiary-mock.com/api/user?limit=" + limit, UserData.class);
        return userData.getData();
    }
}
