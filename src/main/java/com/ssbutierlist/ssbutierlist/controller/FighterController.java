package com.ssbutierlist.ssbutierlist.controller;

import com.ssbutierlist.ssbutierlist.model.Fighter;
import com.ssbutierlist.ssbutierlist.service.FighterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/fighter")
public class FighterController {

    public final FighterService fighterService;

    @Autowired
    public FighterController(FighterService fighterService){
        this.fighterService = fighterService;
    }

    public List<Fighter> getFighters(){
        return fighterService.getFighter();
    }



}
