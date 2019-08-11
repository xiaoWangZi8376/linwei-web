package com.linwei.service.impl;

import com.linwei.firstappproject.service.HelloService;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String say(String massage) {
        return "123" + massage;
    }
}
