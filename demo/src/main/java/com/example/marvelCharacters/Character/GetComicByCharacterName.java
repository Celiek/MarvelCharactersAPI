package com.example.marvelCharacters.Character;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/character/bycomic")
public class GetComicByCharacterName {

    @Autowired
    private CharacterRepository characterRepository;

    public List<CharacterController> findComicByCharacter(@RequestParam(value="character")String character){
        List<CharacterController> comicByCharacterController = characterRepository.findCharacterByComic(character);
        return comicByCharacterController;
    }

}
