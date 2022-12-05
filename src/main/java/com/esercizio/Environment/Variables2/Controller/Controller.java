package com.esercizio.Environment.Variables2.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private Environment environment;

    @GetMapping("/test")
    public String getTest(){
        String str = environment.getProperty("welcomeMsg1.customVar1");
        return str;
    }

    @GetMapping("/prod")
    public String getProd(){
        String str1 = environment.getProperty("welcomeMsg2.customVar2");
        return str1;
    }
}
