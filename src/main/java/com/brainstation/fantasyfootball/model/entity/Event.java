package com.brainstation.fantasyfootball.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Event {
    @Id
    private Long eventId;
    private Integer startRound;
    @OneToOne
    private User eventCreator;
    private String eventName;
    @ManyToMany
    private List<User> userList;
    private String eventDescription;
    private String eventCode;
}
