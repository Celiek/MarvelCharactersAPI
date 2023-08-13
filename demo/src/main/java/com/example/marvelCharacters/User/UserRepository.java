package com.example.marvelCharacters.User;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
public interface UserRepository extends JpaRepository<User,Long>{

    @Transactional
    @Modifying
    @Query(
            value = "INSERT INTO users (imie, nazwisko,login,email,status)" +
                    "SELECT  :imie, :nazwisko, :login, :email,'normaluser' " +
                    "WHERE NOT EXISTS (SELECT 1 FROM users WHERE email = :email) ",
            nativeQuery = true
    )
    void CreateUserIfNotExist(@RequestParam(value = "imie")String imie,
                                    @RequestParam(value = "nazwisko")String nazwisko,
                                    @RequestParam(value = "login")String login,
                                    @RequestParam(value = "email")String email);

    @Transactional
    @Modifying
    @Query(
            value = "INSERT INTO users (imie, nazwisko,login,email,status)" +
                    "SELECT  :imie, :nazwisko, :login, :email,'admin' " +
                    "WHERE NOT EXISTS (SELECT 1 FROM users WHERE email = :email) ",
            nativeQuery = true
    )
    void CreateAdminIfNotExists(@RequestParam(value = "imie")String imie,
                                      @RequestParam(value = "nazwisko")String nazwisko,
                                      @RequestParam(value = "login")String login,
                                      @RequestParam(value = "email")String email
                                    );

    @Query(
            value = "SELECT userid FROM users WHERE login = :login",
            nativeQuery = true
    )
    List<User> getUserID(@RequestParam(value = "login")String login);

    @Query(
            value="SELECT * FROM users",
            nativeQuery = true
    )
    List<User> getUsers();
}
