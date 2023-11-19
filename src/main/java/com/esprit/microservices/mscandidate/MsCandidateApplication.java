package com.esprit.microservices.mscandidate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
@EnableEurekaClient
public class MsCandidateApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsCandidateApplication.class, args);
    }

    @Autowired
    private CandidatRepository repository;

    @Bean
    ApplicationRunner init(){
        return (args) -> {
            repository.save(new Candidat("Mariem","Ch","@gmail.com"));
            repository.save(new Candidat("Sara","Ch","@gmail.com"));
            repository.save(new Candidat("Eya","Ch","@gmail.com"));

            repository.findAll().forEach(System.out::println);
        };
    }
}


