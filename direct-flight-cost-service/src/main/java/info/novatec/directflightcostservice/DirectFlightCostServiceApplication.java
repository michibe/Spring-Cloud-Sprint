package info.novatec.directflightcostservice;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.sleuth.Sampler;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaAuditing
@EnableJpaRepositories
@EntityScan
@EnableEurekaClient
@SpringBootApplication
public class DirectFlightCostServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DirectFlightCostServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner createDirectFlightCosts(DirectFlightCostRepository repo) {
		return args -> {
			repo.save(Arrays.asList(new DirectFlightCost("Lufthansa", "Berlin", "Moskau", 300),
					new DirectFlightCost("Air Berlin", "Berlin", "Prag", 277),
					new DirectFlightCost("Lufthansa", "Frankfurt", "Moskau", 420)));
		};
	}

	@Bean
	Sampler defaultSampler() {
		return new AlwaysSampler();
	}
}
