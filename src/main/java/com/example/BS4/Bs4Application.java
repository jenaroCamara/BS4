package com.example.BS4;

import com.example.BS4.interfaz.Perfiles;
import com.example.BS4.model.perfil1;
import com.example.BS4.model.perfil2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
//@EnableConfigurationProperties(SimpleProperties.class) //Una forma de hacerlo
//@ConfigurationPropertiesScan
public class Bs4Application {

	@Value("${spring.profiles.active:}")
	private String activeProfile;

	public static void main(String[] args) {
		SpringApplication.run(Bs4Application.class, args);
	}

	@Bean
	@Qualifier(value = "Perfil")
	@Profile("perfil")
	Perfiles getProfile()
	{
		if (activeProfile.equals("perfil1")){
			return new perfil1();
		}
		return new perfil2();
	}
}
