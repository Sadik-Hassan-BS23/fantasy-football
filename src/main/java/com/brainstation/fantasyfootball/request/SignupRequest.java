package com.brainstation.fantasyfootball.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Shahinur Beg
 * created date: 10/20/2022
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SignupRequest {
    private Integer id;
    private String firstName;
    private String lastName;
    private String username;
    private String email;
    private String password;
}
