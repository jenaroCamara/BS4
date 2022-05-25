package com.example.BS4.model;

import com.example.BS4.interfaz.Perfiles;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("perfil2")
public class perfil2 implements Perfiles {

    String perfil = "Soy el perfil2";

    @Override
    public void miFuncion() {
        System.out.println("Este es el perfil numero 2");
    }

    public String getPerfil() {
        return perfil;
    }

}
