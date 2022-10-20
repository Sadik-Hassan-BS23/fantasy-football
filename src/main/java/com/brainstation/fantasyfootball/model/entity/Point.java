package com.brainstation.fantasyfootball.model.entity;/*
 * author: Sadik Hassan
 * created: 12:33 pm, 20/10/2022
 */

import com.brainstation.fantasyfootball.common.PointCodeType;
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

public class Point {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long pointID;

    private PointCodeType pointCode;

    private Integer pointScore;

}
