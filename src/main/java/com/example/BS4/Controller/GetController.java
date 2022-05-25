package com.example.BS4.Controller;

import com.example.BS4.interfaz.Perfiles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@ConfigurationProperties
@RestController
@RequestMapping("/controller")
@PropertySource("classpath:application.properties")
@PropertySource("classpath:miconfiguracion.properties")
public class GetController {

    @Autowired
    Perfiles perfiles;


    @GetMapping("/valores")
    public String getValue(@Value("${variable1}") String variable1, @Value("${my.variable2}") int variable2) {
        return "El valor de variable1 es: " + variable1 + ", y el valor de my.var2 es: " + variable2;
    }

    @GetMapping("/var3")
    public String getVar3(@Value("${VAR3:var3 no tiene valor}") String variable3) {
        return "valor de var3 es: " + variable3;
    }

    @GetMapping("/parametros")
    public String getParametros(@Value("${url}") String url, @Value("${password}") String password) {
        return "valor de url es: " + url + ", y la contraseña es: " + password;
    }

    @GetMapping("/parametros2")
    public String getParametros2(@Value("${valor1}") String valor1, @Value("${valor2}") String valor2) {
        return "valor de la variable1 es: " + valor1 + ", y el valor de variable2 es: " + valor2;
    }

    @GetMapping("/perfil")
    public String getPerfil() {
        return perfiles.getPerfil();
    }

}