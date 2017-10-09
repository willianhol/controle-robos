package br.com.nasa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"br.com.nasa.core", "br.com.nasa.endpoint"})
public class ControleRobosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControleRobosApplication.class, args);
	}
}
