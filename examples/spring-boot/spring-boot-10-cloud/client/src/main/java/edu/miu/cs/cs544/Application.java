package edu.miu.cs.cs544;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import edu.miu.cs.cs544.model.Country;
import edu.miu.cs.cs544.service.CountryServiceClient;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = 
				SpringApplication.run(Application.class, args);
		
		CountryServiceClient client = context.getBean(CountryServiceClient.class);
		
		Country country = client.findById("GE");
		
		System.out.println(country);
		
		List<Country> countries = client.findAll();
		countries.forEach(System.out::println);
	}
	
	@Bean 
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
