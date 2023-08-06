package com.example.marvelCharacters.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
public interface UserRepository extends JpaRepository<UserService,Long>{

    @Query(
            value = "INSERT INTO users (imie, nazwisko,login,email,status)" +
                    "VALUES( 'adam','nowak','anowak','anowak@mgaiL.com','user')",
            nativeQuery = true
    )
    List<User> CreateUserIfNotExist();

    @Query(
            value = "INSERT INTO users (imie, nazwisko,login,email,status)" +
                    "VALUES( 'adam','nowak','anowak','anowak@mgaiL.com','admin') ",
            nativeQuery = true
    )
    List<User> CreateAdminIfNotExists();

    @Query(
            value = "",
            nativeQuery = true
    )
    List<User> GetUserID();
}
