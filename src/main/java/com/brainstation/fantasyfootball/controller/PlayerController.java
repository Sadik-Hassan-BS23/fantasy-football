package com.brainstation.fantasyfootball.controller;

import com.brainstation.fantasyfootball.model.entity.Player;
import com.brainstation.fantasyfootball.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/*
 * author: Sadik Hassan
 * created: 11:17 am, 20/10/2022
 */
@Controller
public class PlayerController {
    @Autowired
    private PlayerService playerService;

    @GetMapping("/players")
    public List<Player>getAllPlayer(){
        return PlayerService.getAllPlayer();
    }
    @GetMapping("/players/{playerId}")
    public Player getPlayerDetail(@PathVariable Long playerId){
        return PlayerService.getPlayerDetails(playerId);
    }

}
