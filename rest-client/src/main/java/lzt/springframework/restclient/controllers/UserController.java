package lzt.springframework.restclient.controllers;

import lzt.springframework.restclient.pojo.User;
import lzt.springframework.restclient.services.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.server.ServerWebExchange;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private ApiService apiService;

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/users/{limit}")
    @ResponseBody
    public List<User> getUsers(@PathVariable Integer limit){
        return apiService.getUsers(limit);
    }

    @PostMapping("/users/")
    public String  formPost(Model model, ServerWebExchange serverWebExchange){

        MultiValueMap<String, String> map = serverWebExchange.getFormData().block();
        Integer limit = new Integer(map.get("limit").get(0));

        model.addAttribute("users", apiService.getUsers(limit));

        return "userlist";
    }
}
