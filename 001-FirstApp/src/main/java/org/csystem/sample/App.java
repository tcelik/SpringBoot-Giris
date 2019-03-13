package org.csystem.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
    public static void main(String[] args)
    {
        App.run(args);
    }

    public static void run(String [] args)
    {
        SpringApplication.run(App.class, args);
    }
}


