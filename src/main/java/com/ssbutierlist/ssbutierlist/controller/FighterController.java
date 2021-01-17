package com.ssbutierlist.ssbutierlist.controller;

import com.ssbutierlist.ssbutierlist.model.Fighter;
import com.ssbutierlist.ssbutierlist.service.FighterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/fighter")
public class FighterController {

    public final FighterService fighterService;

    @Autowired
    public FighterController(FighterService fighterService){
        this.fighterService = fighterService;
    }

    @GetMapping
    public List<Fighter> getAllFighters(){
        return fighterService.getAllFightersFromList();
    }

    @GetMapping("{name}")
    public Fighter getFighterByName(@PathVariable String name){
        return fighterService.getFighterByName(name);
    }

    @PostMapping
    public void addFighter(@RequestBody Fighter fighter){
        fighterService.addFighter(fighter);
    }

    @DeleteMapping(path = "{fighterId}")
    public void deleteFighter(@PathVariable("fighterId") Long fighterId){
        fighterService.deleteFighter(fighterId);
    }



}
