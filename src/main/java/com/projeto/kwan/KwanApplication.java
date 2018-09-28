package com.projeto.kwan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.projeto.kwan.config.propety.KwanApiProperty;

@SpringBootApplication
@EnableConfigurationProperties(KwanApiProperty.class)
public class KwanApplication {

	public static void main(String[] args) {
		SpringApplication.run(KwanApplication.class, args);
	}
}
