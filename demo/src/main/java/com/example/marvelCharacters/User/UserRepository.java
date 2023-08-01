package com.example.marvelCharacters.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
public interface UserRepository extends JpaRepository<UserService,Long>{

    @Query(
            value = "",
            nativeQuery = true
    )
    List<User> CreateUserIfNotExist();

    @Query(
            value = "",
            nativeQuery = true
    )
    List<User> GetUserID();
}
