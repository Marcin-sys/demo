package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository){
        return args -> {
            Student marian = new Student(
                    "Marian",
                    "miarian.jamal@gmail.com",
                    LocalDate.of(2000, 1, 5)
            );
            Student alex = new Student(
                    "Marian",
                    "miarian.jamal@gmail.com",
                    LocalDate.of(2004, 1, 5)
            );

            repository.saveAll(
                    List.of(marian,alex)
            );
        };
    }
}
