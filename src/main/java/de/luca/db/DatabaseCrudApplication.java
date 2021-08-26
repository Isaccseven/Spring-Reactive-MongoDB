package de.luca.db;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class DatabaseCrudApplication {

    public static void main(String[] args) {
        SpringApplication.run(DatabaseCrudApplication.class, args);
    }

}
