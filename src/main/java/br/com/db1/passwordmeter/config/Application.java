package br.com.db1.passwordmeter.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "br.com.db1.passwordmeter")
public class Application {

    public static void main(String[] args) {
    	System.setProperty("spring.application.name", "password-meter");
        SpringApplication.run(Application.class, args);
    }

}