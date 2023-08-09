package com.example.marvelCharacters.User;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
public interface UserRepository extends JpaRepository<User,Long>{
    //nie skonczone zapytanie do bazy danych
    @Transactional
    @Modifying
    @Query(
            value = "INSERT INTO users (imie, nazwisko,login,email,status)" +
                    "VALUES(:imie, :nazwisko, :login, :email, 'user')",
            nativeQuery = true
    )
    List<User> CreateUserIfNotExist(@RequestParam(value = "imie")String imie,
                                    @RequestParam(value = "nazwisko")String nazwisko,
                                    @RequestParam(value = "login")String login,
                                    @RequestParam(value = "email")String email);

    @Transactional
    @Modifying
    @Query(
            value = "INSERT INTO users (imie, nazwisko,login,email,status)" +
                    "VALUES( :imie, :nazwisko, :login, :email,'admin') ",
            nativeQuery = true
    )
    List<User> CreateAdminIfNotExists(@RequestParam(value = "imie")String imie,
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
