package com.example.eurikaclient;

import com.example.eurikaclient.entity.Client;
import com.example.eurikaclient.repository.ClientRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
//@Author Behloul
@SpringBootApplication
@EnableDiscoveryClient

public class EurikaclientApplication {
   
    public static void main(String[] args) {
        SpringApplication.run(EurikaclientApplication.class, args);
    }

    @Bean
    CommandLineRunner initializeDatabase(ClientRepo clientRepository) { return args -> {
            clientRepository.save(new Client(Long.parseLong("1"), "ABALLAGH", Float.parseFloat("24")));
            clientRepository.save(new Client(Long.parseLong("2"), "NEZAR", Float.parseFloat("18")));
        };
    }
}

