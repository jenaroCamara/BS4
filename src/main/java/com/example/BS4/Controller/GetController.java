package com.example.BS4.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@ConfigurationProperties
@RestController
@RequestMapping("/controller")
public class GetController {

    @GetMapping("/valores")
    public String getValue(@Value("${variable1}") String variable1, @Value("${my.variable2}")  int variable2){
        return "El valor de variable1 es: " + variable1 + ", y el valor de my.var2 es: "+variable2;
    }

    @GetMapping("/var3")
    public String getVar3(@Value("${VAR3:var3 no tiene valor}") String variable3){
        return  "valor de var3 es: " + variable3;
    }

}