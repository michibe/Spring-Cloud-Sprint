package info.novatec.logtracing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import zipkin.server.EnableZipkinServer;

@EnableZipkinServer
@SpringBootApplication
public class LogTracingApplication {

	public static void main(String[] args) {
		SpringApplication.run(LogTracingApplication.class, args);
	}
}
