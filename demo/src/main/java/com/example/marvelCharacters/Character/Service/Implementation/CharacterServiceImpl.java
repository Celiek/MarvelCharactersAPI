package com.example.marvelCharacters.Character.Service.Implementation;

import com.example.marvelCharacters.Character.Entity.Character;
import com.example.marvelCharacters.Character.Exception.ResourceNotFoundException;
import com.example.marvelCharacters.Character.Mapper.CharacterMapper;
import com.example.marvelCharacters.Character.Repository.CharacterRepository;
import com.example.marvelCharacters.Character.Service.CharacterService;
import com.example.marvelCharacters.Character.dto.CharacterDto;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.stream.Collectors;


@Service
@AllArgsConstructor
public class CharacterServiceImpl implements CharacterService {
    //@Autowired
    private CharacterRepository characterRepository;

    @Override
   public CharacterDto createCharacter(CharacterDto characterDto) {
       Character character = CharacterMapper.mapToCharacter(characterDto);
       Character savedCharacter = characterRepository.save(character);
       return CharacterMapper.mapToCharacterDto(savedCharacter);
   }
    @Override
   public CharacterDto getCharacterById(Long characterId){
        Character character = characterRepository.findById(characterId)
                .orElseThrow( ()->
                        new ResourceNotFoundException("Character with provided id is not exist" + characterId));
            return CharacterMapper.mapToCharacterDto(character);
   }

    @Override
   public List<CharacterDto> getAllCharacters(){
        List<Character> characters = characterRepository.findAll();
        return characters.stream().map((character) -> CharacterMapper.mapToCharacterDto(character))
                .collect(Collectors.toList());
   }

    public List<Long> countAllCharacterOccurences(@RequestParam(value = "chara") String chara){
        return characterRepository.countAllCharacterOccurences(chara);
    }

    public void deleteCharacter(Long l_p){
        Character character = characterRepository.findById(l_p).orElseThrow(
                () -> new ResourceNotFoundException("Character with provided id is not exist" + l_p)
        );
        characterRepository.deleteById(l_p);
    }



}
