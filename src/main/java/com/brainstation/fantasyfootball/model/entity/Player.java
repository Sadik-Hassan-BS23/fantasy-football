package com.brainstation.fantasyfootball.model.entity;

import com.brainstation.fantasyfootball.common.PlayerPositionType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*
 * author: Sadik Hassan
 * created: 12:30 pm, 20/10/2022
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstname;
    private String lastname;
    private String nickname;
    private PlayerPositionType positionType;
    private Long value;
    private String country;
}
