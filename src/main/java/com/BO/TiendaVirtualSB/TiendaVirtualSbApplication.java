package com.BO.TiendaVirtualSB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TiendaVirtualSbApplication {

	public static void main(String[] args) {
		System.setProperty("server.servlet.context-path", "/TiendaVirtualApp");
		SpringApplication.run(TiendaVirtualSbApplication.class, args);
	}
}
