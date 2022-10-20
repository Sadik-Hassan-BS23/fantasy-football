package com.brainstation.fantasyfootball.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class UserBalance {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer userBalanceId;
    private Integer userId;
    private Integer eventId;
    private Long userPoint;
}
