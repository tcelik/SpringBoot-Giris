package org.csystem.sample;


import org.csystem.sample.calculator.operation.SimpleCalculator;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class App {
    public static void main(String[] args)
    {
        var contextAl = SpringApplication.run(App.class, args);
    }

    @Bean
    public ApplicationRunner run(SimpleCalculator calculator)
    {
        return args -> {
            calculator.calculate('+', 10, 10);
            calculator.calculate('*', 10, 10);
        };
    }
}



