package com.example.marvelCharacters.Character.Mapper;

import com.example.marvelCharacters.Character.dto.CharacterDto;
import com.example.marvelCharacters.Character.Entity.Character;


public class CharacterMapper {

    public static CharacterDto mapToCharacterDto(Character character){
        return new CharacterDto(
                character.getL_p(),
                character.getMarvel_comic_character_name(),
                character.getComic_appearance_1(),
                character.getComic_appearance_2(),
                character.getComic_appearance_3(),
                character.getComic_appearance_4(),
                character.getComic_appearance_5(),
                character.getComic_appearance_6(),
                character.getComic_appearance_7(),
                character.getComic_appearance_8(),
                character.getComic_appearance_9(),
                character.getComic_appearance_10(),
                character.getComic_appearance_11(),
                character.getComic_appearance_12(),
                character.getComic_appearance_13(),
                character.getComic_appearance_14(),
                character.getComic_appearance_15(),
                character.getComic_appearance_16(),
                character.getComic_appearance_17(),
                character.getComic_appearance_18(),
                character.getComic_appearance_19(),
                character.getComic_appearance_20(),
                character.getComic_appearance_21(),
                character.getComic_appearance_22(),
                character.getComic_appearance_23(),
                character.getComic_appearance_24(),
                character.getComic_appearance_25(),
                character.getComic_appearance_26(),
                character.getComic_appearance_27(),
                character.getComic_appearance_28(),
                character.getComic_appearance_29(),
                character.getComic_appearance_30(),
                character.getComic_appearance_31(),
                character.getComic_appearance_32(),
                character.getComic_appearance_33(),
                character.getComic_appearance_34(),
                character.getComic_appearance_35()
        );
    }

    public static Character mapToCharacter(CharacterDto characterDto){
        return new Character(
                characterDto.getL_p(),
                characterDto.getMarvel_comic_character_name(),
                characterDto.getComic_appearance_1(),
                characterDto.getComic_appearance_2(),
                characterDto.getComic_appearance_3(),
                characterDto.getComic_appearance_4(),
                characterDto.getComic_appearance_5(),
                characterDto.getComic_appearance_6(),
                characterDto.getComic_appearance_7(),
                characterDto.getComic_appearance_8(),
                characterDto.getComic_appearance_9(),
                characterDto.getComic_appearance_10(),
                characterDto.getComic_appearance_11(),
                characterDto.getComic_appearance_12(),
                characterDto.getComic_appearance_13(),
                characterDto.getComic_appearance_14(),
                characterDto.getComic_appearance_15(),
                characterDto.getComic_appearance_16(),
                characterDto.getComic_appearance_17(),
                characterDto.getComic_appearance_18(),
                characterDto.getComic_appearance_19(),
                characterDto.getComic_appearance_20(),
                characterDto.getComic_appearance_21(),
                characterDto.getComic_appearance_22(),
                characterDto.getComic_appearance_23(),
                characterDto.getComic_appearance_24(),
                characterDto.getComic_appearance_25(),
                characterDto.getComic_appearance_26(),
                characterDto.getComic_appearance_27(),
                characterDto.getComic_appearance_28(),
                characterDto.getComic_appearance_29(),
                characterDto.getComic_appearance_30(),
                characterDto.getComic_appearance_31(),
                characterDto.getComic_appearance_32(),
                characterDto.getComic_appearance_33(),
                characterDto.getComic_appearance_34(),
                characterDto.getComic_appearance_35()
        );
    }
}
