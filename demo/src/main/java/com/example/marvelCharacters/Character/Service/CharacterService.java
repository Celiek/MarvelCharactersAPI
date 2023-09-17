package com.example.marvelCharacters.Character.Service;

import com.example.marvelCharacters.Character.dto.CharacterDto;

import java.util.List;

public interface CharacterService {
    CharacterDto createCharacter(CharacterDto characterDto);

    CharacterDto getCharacterById(Long l_p);

    List<CharacterDto> getAllCharacters();

    //CharacterDto updateCharacter(Long l_p, CharacterDto updateCharacter);

    void deleteCharacter(Long l_p);

     List<Long> countAllCharacterOccurences(String chara);
}

