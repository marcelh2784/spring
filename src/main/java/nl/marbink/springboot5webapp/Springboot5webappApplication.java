package nl.marbink.springboot5webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//TODO mvn spring-boot:run -Dspring-boot.run.arguments=--debug; show all autoconfiguration classes
@SpringBootApplication
@ComponentScan(basePackages = {"nl.marbink"})
public class Springboot5webappApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springboot5webappApplication.class, args);
	}
}
