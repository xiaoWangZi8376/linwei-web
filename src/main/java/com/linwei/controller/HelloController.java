package com.linwei.controller;

import com.linwei.firstappproject.dao.User;
import com.linwei.firstappproject.service.impl.HelloServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @Autowired
    private HelloServiceImpl helloService;

    @RequestMapping("/info")
    public String getHelloService( String masage) {
        return helloService.say(masage);
    }
    @RequestMapping("/info/user")
    public User userInfo() {
        User user = new User();
        user.setPassword("");
        user.setName("cherish");
        user.setGender("女");
        user.setAge("1");
        user.setNickname("1234");
        return user;
    }
    @RequestMapping("/failed")
    public Map<String, String> requestFailed() {

        Map<String, String> map = new HashMap<>();
        map.put("code", "-1");
        map.put("msg", "请求错误");
        return map;
    }
}
