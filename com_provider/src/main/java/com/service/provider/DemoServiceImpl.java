package com.service.provider;

import com.service.DemoService;

public class DemoServiceImpl implements DemoService{
    public String sayHello(String name) {
        return "Hello" + name;
    }
}
