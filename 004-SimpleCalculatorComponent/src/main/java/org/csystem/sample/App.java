package org.csystem.sample;


import org.csystem.sample.calculator.operation.IOperation;
import org.csystem.sample.calculator.operation.SimpleCalculator;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.DefaultApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class App {
    public static void main(String[] args)
    {
        var contextAl = SpringApplication.run(App.class, args);
    }

    @Bean
    public ApplicationRunner run(SimpleCalculator calculator)
    {
        System.out.println(calculator.toString());
        return args -> {
            calculator.calculate('+', 10, 10);
            calculator.calculate('*', 10, 10);
        };
    }

    @Bean
    public SimpleCalculator get(List<IOperation> operations)
    {
        return new SimpleCalculator(operations);
    }

}


