package com.example.azurespringsofiafsd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzureSpringSofiafsdApplication {
@GetMapping("/message")	
public String message() {
	return "Yayy!! deployed project successfuly in azure";
}
	public static void main(String[] args) {
		SpringApplication.run(AzureSpringSofiafsdApplication.class, args);
	}

}
