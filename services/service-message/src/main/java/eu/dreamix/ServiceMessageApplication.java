package eu.dreamix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ServiceMessageApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceMessageApplication.class, args);
	}
}
