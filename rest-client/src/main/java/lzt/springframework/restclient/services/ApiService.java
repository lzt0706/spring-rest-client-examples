package lzt.springframework.restclient.services;

import lzt.springframework.restclient.pojo.User;

import java.util.List;

public interface ApiService {
    List<User> getUsers(Integer limit);
}
