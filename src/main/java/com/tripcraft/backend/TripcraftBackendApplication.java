package com.tripcraft.backend;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TripcraftBackendApplication {

	public static void main(String[] args) {
		Dotenv dotenv = Dotenv.configure().ignoreIfMissing().load();
		System.setProperty("DB_HOST", dotenv.get("DB_HOST", "localhost"));
		System.setProperty("DB_PORT", dotenv.get("DB_PORT", "5432"));
		System.setProperty("DB_NAME", dotenv.get("DB_NAME", "tripcraft"));
		System.setProperty("DB_USERNAME", dotenv.get("DB_USERNAME", "default_username"));
		System.setProperty("DB_PASSWORD", dotenv.get("DB_PASSWORD", "default_password"));

		SpringApplication.run(TripcraftBackendApplication.class, args);
	}
}