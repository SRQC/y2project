package com.zb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(value = {"dubbo_consumer.xml"})
public class DxconsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DxconsumerApplication.class, args);
	}
}
