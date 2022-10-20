package com.brainstation.fantasyfootball.service;/*
 * author: Sadik Hassan
 * created: 4:05 pm, 20/10/2022
 */

import com.brainstation.fantasyfootball.model.entity.Player;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PlayerService {
    private static  Map<Long, Player> player = new HashMap<>();

    public static List<Player> getAllPlayer() {
        return new ArrayList<>(player.values());
    }
    public static Player getPlayerDetails(Long playerId) {
        return player.get(playerId);
    }
}
