package com.brainstation.fantasyfootball.repository;
/*
 * author: Sadik Hassan
 * created: 12:30 pm, 20/10/2022
 */

import com.brainstation.fantasyfootball.model.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<Player,Long> {

}
