package com.brainstation.fantasyfootball.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Team {
    @Id
    private Integer teamId;
    private Integer eventId;
    private Integer roundId;

    private Integer player1;
    private Integer player2;
    private Integer player3;
    private Integer player4;
    private Integer player5;
    private Integer player6;
    private Integer player7;
    private Integer player8;
    private Integer player9;
    private Integer player10;
    private Integer player11;
}
