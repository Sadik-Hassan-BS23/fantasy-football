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
public class UserBalance {
    @Id
    private Integer userBalanceId;
    private Integer userId;
    private Integer eventId;
    private Long userPoint;
}
