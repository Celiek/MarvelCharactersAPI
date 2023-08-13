package com.example.marvelCharacters.User;

import jakarta.persistence.*;

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

    public User(String imie, String nazwisko, String login, String email, String status) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.login = login;
        this.email = email;
        this.status = status;
    }

    public User() {
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getUserid() {
        return userid;
    }


}
