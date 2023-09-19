package com.example.marvelCharacters.User.Service;
import com.example.marvelCharacters.User.Dto.UserDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    UserDto createUser(UserDto userDto);

    UserDto getUserById(Long userId);
    List<UserDto> getAllEmployees();
    UserDto updatedUser(Long userId, UserDto updatedUser);
    void deleteUser(Long userId);

}
