package com.example.marvelCharacters.User.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {
    private String imie;
    private String nazwisko;
    private String login;
    private String email;
    private String status;
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long userid;
}
