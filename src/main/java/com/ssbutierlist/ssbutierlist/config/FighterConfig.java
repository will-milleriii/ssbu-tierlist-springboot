package com.ssbutierlist.ssbutierlist.config;


import com.ssbutierlist.ssbutierlist.model.Fighter;
import com.ssbutierlist.ssbutierlist.repo.FighterRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class FighterConfig {

    @Bean
    CommandLineRunner commandLineRunner(FighterRepository fighterRepository){
        return args -> {
            Fighter mario = new Fighter(
                    "Mario",
                    "S",
                    "Middleweight",
                    "Donkey Kong (1981)",
                    "Super Smash Bros (1999)",
                    "All-Rounder",
                    "C"

            );

            Fighter pikachu = new Fighter(
                    "Pikachu",
                    "S",
                    "Featherweight",
                    "Pokemon Red & Blue (1996)",
                    "Super Smash Bros (1999)",
                    "Pressure",
                    "S"

            );

            fighterRepository.saveAll(
                    List.of(mario, pikachu)
            );
        };
    }
}
