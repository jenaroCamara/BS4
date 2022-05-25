package com.example.BS4.model;

import com.example.BS4.interfaz.Perfiles;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("Perfil1")
public class perfil1 implements Perfiles {

    String perfil = "Soy el perfil1";

    @Override
    public void miFuncion() {
        System.out.println("Este es el perfil numero 1");
    }

    public String getPerfil() {
        return perfil;
    }
}
