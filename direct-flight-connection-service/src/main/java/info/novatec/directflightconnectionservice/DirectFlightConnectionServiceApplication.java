package info.novatec.directflightconnectionservice;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.sleuth.Sampler;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@EnableEurekaClient
@EnableMongoAuditing
@SpringBootApplication
public class DirectFlightConnectionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DirectFlightConnectionServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner createDirectFlightConnections(DirectFlightConnectionRepository directFlightConnectionRepository) {
		return args -> {
			directFlightConnectionRepository.deleteAll();
			directFlightConnectionRepository.save(Arrays.asList(
					new DirectFlightConnection("Lufthansa", "Frankfurt", "Moskau", Instant.now(),
							Instant.now().plus(8, ChronoUnit.HOURS)),
					new DirectFlightConnection("Lufthansa", "Munich", "New York", Instant.now(),
							Instant.now().plus(16, ChronoUnit.HOURS)),
					new DirectFlightConnection("Lufthansa", "Berlin", "Moskau", Instant.now(),
							Instant.now().plus(7, ChronoUnit.HOURS)),
					new DirectFlightConnection("Air Berlin", "Berlin", "Prag", Instant.now(),
							Instant.now().plus(2, ChronoUnit.HOURS))));
		};
	}

	@Bean
	Sampler defaultSampler() {
		return new AlwaysSampler();
	}

}
