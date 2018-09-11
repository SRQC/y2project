package com.zb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(value = {"dubbo_provider.xml"})
public class DxproviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(DxproviderApplication.class, args);
	}
}
