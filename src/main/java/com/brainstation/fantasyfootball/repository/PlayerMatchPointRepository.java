package com.brainstation.fantasyfootball.repository;/*
 * author: Sadik Hassan
 * created: 12:33 pm, 20/10/2022
 */

import com.brainstation.fantasyfootball.model.entity.PlayerMatchPoint;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerMatchPointRepository  extends JpaRepository<PlayerMatchPoint, Long> {
}
