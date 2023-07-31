package com.example.marvelCharacters.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
public interface UserRepository extends JpaRepository<UserService,Long>{

    List<User> CreateUserIfNotExist();

    List<User> GetUserID();
}
