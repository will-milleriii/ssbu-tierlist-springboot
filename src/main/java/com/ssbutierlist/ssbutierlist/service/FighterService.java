package com.ssbutierlist.ssbutierlist.service;

import com.ssbutierlist.ssbutierlist.model.Fighter;
import com.ssbutierlist.ssbutierlist.repo.FighterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FighterService {

    private final FighterRepository fighterRepository;

    @Autowired
    public FighterService(FighterRepository fighterRepository){
        this.fighterRepository = fighterRepository;
    }

    public List<Fighter> getAllFightersFromList(){
        return fighterRepository.findAll();
    }

    public Fighter getFighterByName(String name){
        return fighterRepository.findByName(name);
    }

    public void addFighter(Fighter fighter) {
        Optional<Fighter> fighterOptional = fighterRepository
                .findFighterByName(fighter.getName());
        if (fighterOptional.isPresent()){
            throw new IllegalStateException("fighter currently exists");
        }
        fighterRepository.save(fighter);
    }

    public void deleteFighter(Long fighterId){
        fighterRepository.existsById(fighterId);
    }
}
