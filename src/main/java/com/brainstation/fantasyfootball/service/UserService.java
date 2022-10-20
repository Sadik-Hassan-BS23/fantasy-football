package com.brainstation.fantasyfootball.service;

import com.brainstation.fantasyfootball.request.LoginRequest;
import com.brainstation.fantasyfootball.request.SignupRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

/**
 * @author Shahinur Beg
 * created date: 10/20/2022
 */
@Service
public interface UserService {
    ResponseEntity<?> signup(SignupRequest user);
    ResponseEntity<?> login(LoginRequest loginRequest);
}
