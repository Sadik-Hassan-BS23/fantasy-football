package com.brainstation.fantasyfootball.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Match {
    @Id
    private Integer matchId;
    private Integer tournamentId;
    private Date matchDate;
    private String team1Name;
    private String team2Name;
    private Integer team1Goal;
    private Integer team2Goal;
}
