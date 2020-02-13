package za.co.agent.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(scanBasePackages = "true")
@ComponentScan(value = "za.co.agent.demo")
@EnableAutoConfiguration
@EnableMongoRepositories
public class Main {
  
	/**
     * @param args
     */
    public static void main( String[] args ) {
        SpringApplication.run(Main.class, args);
    }
}
