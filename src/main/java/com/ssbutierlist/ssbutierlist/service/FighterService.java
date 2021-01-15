package com.ssbutierlist.ssbutierlist.service;

import com.ssbutierlist.ssbutierlist.model.Fighter;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FighterService {

    public List<Fighter> getFighter(){
        return List.of(
                new Fighter(
                        "Mario",
                        "S",
                        "Middleweight",
                        "Donkey Kong (1981)",
                        "Super Smash Bros (1999)",
                        "All-Rounder",
                        "C"

                )
        );
    }
}
