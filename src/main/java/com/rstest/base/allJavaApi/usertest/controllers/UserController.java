package com.rstest.base.allJavaApi.usertest.controllers;

import com.rstest.base.allJavaApi.usertest.model.User;
import com.rstest.base.allJavaApi.usertest.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    UserService userService;
@Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/getAllUsers")
    public List<User> getUsers(){
        System.out.println("http://localhost:8080/getAllUsers");
        return userService.getUsers();
    }
}
