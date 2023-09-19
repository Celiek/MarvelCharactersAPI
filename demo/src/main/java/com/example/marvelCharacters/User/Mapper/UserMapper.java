package com.example.marvelCharacters.User.Mapper;

import com.example.marvelCharacters.User.Entity.User;
import com.example.marvelCharacters.User.Dto.UserDto;

public class UserMapper {

    public static UserDto mapToUserDto(User user){
        return new UserDto(
            user.getUserid(),
            user.getEmail(),
            user.getImie(),
            user.getNazwisko(),
                user.getLogin(),
                user.getStatus()
        );
    }

    public static User mapToUser(UserDto userDto){
        return new User(
                userDto.getImie(),
                userDto.getNazwisko(),
                userDto.getLogin(),
                userDto.getEmail(),
                userDto.getStatus(),
                userDto.getUserid()
        );
    }
}
