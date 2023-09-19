package com.example.marvelCharacters.User.Service.impl;

import com.example.marvelCharacters.User.Dto.UserDto;
import com.example.marvelCharacters.User.Entity.User;
import com.example.marvelCharacters.User.Exception.ResourceNotFoundException;
import com.example.marvelCharacters.User.Mapper.UserMapper;
import com.example.marvelCharacters.User.Repository.UserRepository;
import com.example.marvelCharacters.User.Service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    @Override
    public UserDto createUser(UserDto userDto) {

        User user = UserMapper.mapToUser(userDto);
        User savedUser = userRepository.save(user);
        return UserMapper.mapToUserDto(savedUser);
    }

    @Override
    public UserDto getUserById(Long userId) {
        User user = userRepository.findById(userId)
                .orElseThrow( ()->
                        new ResourceNotFoundException("User with provided id is not exists: " + userId)
                );
        return UserMapper.mapToUserDto(user);
    }

    @Override
    public List<UserDto> getAllEmployees() {
        List<User> users = userRepository.findAll();

        return users.stream().map((user)->UserMapper.mapToUserDto(user))
                .collect(Collectors.toList());
    }

    @Override
    public UserDto updatedUser(Long userId, UserDto updatedUser) {
        User user = userRepository.findById(userId).orElseThrow(
                ()-> new ResourceNotFoundException("User with provided id is not exits "+userId)
        );

        user.setImie(updatedUser.getImie());
        user.setLogin(updatedUser.getLogin());
        user.setEmail(updatedUser.getEmail());
        user.setNazwisko(updatedUser.getNazwisko());
        user.setStatus(updatedUser.getStatus());

        User updatedUserObj = userRepository.save(user);

        return UserMapper.mapToUserDto(updatedUserObj);
    }

    @Override
    public void deleteUser(Long userId) {
        User user = userRepository.findById(userId).orElseThrow(
                ()-> new ResourceNotFoundException("USer with provided id does not exists "+userId)
        );
        userRepository.deleteById(userId);
    }
}
