package edu.nwmissouri.zoo04lab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Adding a Web front-end to our Zoo App with Spring Boot.
 *
 * Built with Spring Initializr at https://start.spring.io/.
 *
 * What annotation was added? Hint: see @ sign below.
 *
 * What new dependencies? Hint: see import statements above.
 *
 * Where else must we include these dependencies? Hint: configuration file in
 * XML format
 *
 * @author Denise Case
 */
@SpringBootApplication
public class ZooWebApp {
   

    /**
     * Entry point for our new Spring Boot Web App.
     *
     * What do we pass in to the static run() method?
     *
     * Tip: Right-click and select Format after editing code.
     * 
     * Local: http://localhost:8080
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(ZooWebApp.class, args);
    }

}
