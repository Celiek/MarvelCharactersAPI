package com.example.marvelCharacters.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/user")
public class UserController {

    private final User user;

    @Autowired
    public UserController(User user) {
        this.user = user;
    }

//    public List<User> getUser(){
//        return userService.getUser();
//    }

    public List<User> getUsers() {
        return List.of(
                new User(
                        "adam",
                        "kielecki",
                        "akiel",
                        "akiel@gmail.com",
                        "user",
                        1L
                )
        );
    }
}
