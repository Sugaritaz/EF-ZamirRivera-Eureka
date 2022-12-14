package com.idat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EfZamirRiveraEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfZamirRiveraEurekaServerApplication.class, args);
	}

}
