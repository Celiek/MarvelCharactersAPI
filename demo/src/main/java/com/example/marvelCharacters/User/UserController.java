package com.example.marvelCharacters.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/user")
public class UserController {

    //private final User user;

    private final UserRepository userRepository;

    //@Autowired
//    public UserController(User user, UserRepository userRepository) {
//        this.user = user;
//        this.userRepository = userRepository;
//    }

    @Autowired
    public UserController( UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getEveryUser(){
        return userRepository.getUsers();
    }

    @PostMapping("/creteadmin")
    public List<User> createAdminIfNotExists(@RequestParam(value = "imie")String imie,
                                             @RequestParam(value = "nazwisko")String nazwisko,
                                             @RequestParam(value = "login")String login,
                                             @RequestParam(value = "email")String email){

        return userRepository.CreateAdminIfNotExists(imie,nazwisko,login,email);

    }

    @PostMapping("/createuser")
    public List<User> createUserIfNotExists(@RequestParam(value = "imie")String imie,
                                            @RequestParam(value = "nazwisko")String nazwisko,
                                            @RequestParam(value = "login")String login,
                                            @RequestParam(value = "email")String email){

        return userRepository.CreateUserIfNotExist(imie, nazwisko, login, email);
    }

    @GetMapping
    public List<User> getUsers(){
        return List.of(
                new User(
                        "adam",
                        "nowak",
                        "anowak",
                        "anowak@o2.pl",
                        "user"
                )
        );
    }
}
