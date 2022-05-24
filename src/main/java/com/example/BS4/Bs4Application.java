package com.example.BS4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableConfigurationProperties(SimpleProperties.class) //Una forma de hacerlo
//@ConfigurationPropertiesScan
public class Bs4Application {


	public static void main(String[] args) {
		SpringApplication.run(Bs4Application.class, args);
	}

		/*@PostConstruct
		private void postInit(){
			System.out.println("Simple properties info");
			System.out.println(simpleProperties);
		}*/
}
