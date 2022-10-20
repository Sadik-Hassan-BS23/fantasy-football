package com.brainstation.fantasyfootball.controller;

import com.brainstation.fantasyfootball.request.SignupRequest;
import com.brainstation.fantasyfootball.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Shahinur Beg
 * created date: 10/19/2022
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/signup")
    public String userSignUp(@RequestBody SignupRequest signupRequest){
        userService.signup(signupRequest);
        return null;
    }
    @PostMapping("/login")
    public String userLogin(){

        return  null;
    }


}
