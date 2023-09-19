package com.example.marvelCharacters.User.Dto;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private Long userid;
    private String imie;
    private String nazwisko;
    private String login;
    private String email;
    private String status;

}
