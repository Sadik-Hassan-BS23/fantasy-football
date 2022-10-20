package com.brainstation.fantasyfootball.service.impl;

import com.brainstation.fantasyfootball.repository.UserRepository;
import com.brainstation.fantasyfootball.request.LoginRequest;
import com.brainstation.fantasyfootball.request.SignupRequest;
import com.brainstation.fantasyfootball.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

/**
 * @author Shahinur Beg
 * created date: 10/20/2022
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public ResponseEntity<?> signup(SignupRequest user) {

        return null;
    }

    @Override
    public ResponseEntity<?> login(LoginRequest loginRequest) {
        return null;
    }
}
