package com.example.marvelCharacters.User.Controller;

import com.example.marvelCharacters.User.Entity.User;
import com.example.marvelCharacters.User.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/user")
public class UserController {

    private final UserRepository userRepository;

    @Autowired
    public UserController( UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping("/getusers")
    public List<User> getEveryUser(){
        return userRepository.getUsers();
    }

    @PostMapping("/createadmin")
    public List<User> createAdminIfNotExists(@RequestParam(value = "imie")String imie,
                                             @RequestParam(value = "nazwisko")String nazwisko,
                                             @RequestParam(value = "login")String login,
                                             @RequestParam(value = "email")String email){

         userRepository.CreateAdminIfNotExists(imie,nazwisko,login,email);
         //do usunięcia, włączone tylko dla testów
        return userRepository.findAll();
    }

    @PostMapping("/createuser")
    public List<User> createUserIfNotExists(@RequestParam(value = "imie")String imie,
                                            @RequestParam(value = "nazwisko")String nazwisko,
                                            @RequestParam(value = "login")String login,
                                            @RequestParam(value = "email")String email){

         userRepository.CreateUserIfNotExist(imie, nazwisko, login, email);
        return userRepository.findAll();
    }


    //tylko dla testów
//    @RequestMapping("/getAll")
//    public List<User> getUsers(){
//        return List.of(
//                new User(
//                        "adam",
//                        "nowak",
//                        "anowak",
//                        "anowak@o2.pl",
//                        "user"
//                )
//        );
//    }

}
