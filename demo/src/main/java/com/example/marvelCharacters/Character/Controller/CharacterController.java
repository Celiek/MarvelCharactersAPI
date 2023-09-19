package com.example.marvelCharacters.Character.Controller;

import com.example.marvelCharacters.Character.Entity.Character;
import com.example.marvelCharacters.Character.Repository.CharacterRepository;
import com.example.marvelCharacters.Character.Service.Implementation.CharacterServiceImpl;
import com.example.marvelCharacters.Character.dto.CharacterDto;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("api/v1/character")

public class CharacterController {
    private CharacterRepository character;
    @Autowired
    private CharacterServiceImpl characterService;
    //TODO:
    //Do przerobienia na DTO(Sporo roboty)
    @Autowired
    public CharacterController(CharacterRepository character) {
        this.character = character;
    }
    @GetMapping("/countalloccurences")
    List<Long> countAllCharacterOccurences(@RequestParam(value = "chara") String chara){
        return character.countAllCharacterOccurences(chara);
    }

    @GetMapping("/characterbycomic")
    List<String> findCharacterByComic(@RequestParam(value = "comic")String comic){
        return character.findCharacterByComic(comic);
    }

    @GetMapping("/bycharactername")
    List<String> findComicsByCharacterName(@RequestParam(value = "name")String name){
        return character.findComicsByCharacterName(name);
    }
    @PostMapping("/insertcomic")
    List<Character> insertComic(@RequestParam(value="marvel_comic_character_name")String marvel_comic_character_name,
                                @RequestParam(value="comic_appearance_1")String comic_appearance_1,
                                @RequestParam(value="comic_appearance_1")String comic_appearance_2,
                                @RequestParam(value="comic_appearance_3")String comic_appearance_3,
                                @RequestParam(value="comic_appearance_4")String comic_appearance_4,
                                @RequestParam(value="comic_appearance_5")String comic_appearance_5,
                                @RequestParam(value="comic_appearance_6")String comic_appearance_6,
                                @RequestParam(value="comic_appearance_7")String comic_appearance_7,
                                @RequestParam(value="comic_appearance_8")String comic_appearance_8,
                                @RequestParam(value="comic_appearance_9")String comic_appearance_9,
                                @RequestParam(value="comic_appearance_10")String comic_appearance_10,
                                @RequestParam(value="comic_appearance_11")String comic_appearance_11,
                                @RequestParam(value="comic_appearance_12")String comic_appearance_12,
                                @RequestParam(value="comic_appearance_13")String comic_appearance_13,
                                @RequestParam(value="comic_appearance_14")String comic_appearance_14,
                                @RequestParam(value="comic_appearance_15")String comic_appearance_15,
                                @RequestParam(value="comic_appearance_16")String comic_appearance_16,
                                @RequestParam(value="comic_appearance_17")String comic_appearance_17,
                                @RequestParam(value="comic_appearance_18")String comic_appearance_18,
                                @RequestParam(value="comic_appearance_19")String comic_appearance_19,
                                @RequestParam(value="comic_appearance_20")String comic_appearance_20,
                                @RequestParam(value="comic_appearance_21")String comic_appearance_21,
                                @RequestParam(value="comic_appearance_22")String comic_appearance_22,
                                @RequestParam(value="comic_appearance_23")String comic_appearance_23,
                                @RequestParam(value="comic_appearance_24")String comic_appearance_24,
                                @RequestParam(value="comic_appearance_25")String comic_appearance_25,
                                @RequestParam(value="comic_appearance_26")String comic_appearance_26,
                                @RequestParam(value="comic_appearance_27")String comic_appearance_27,
                                @RequestParam(value="comic_appearance_28")String comic_appearance_28,
                                @RequestParam(value="comic_appearance_29")String comic_appearance_29,
                                @RequestParam(value="comic_appearance_30")String comic_appearance_30,
                                @RequestParam(value="comic_appearance_31")String comic_appearance_31,
                                @RequestParam(value="comic_appearance_32")String comic_appearance_32,
                                @RequestParam(value="comic_appearance_33")String comic_appearance_33,
                                @RequestParam(value="comic_appearance_34")String comic_appearance_34,
                                @RequestParam(value="comic_appearance_35")String comic_appearance_35){
        return character.insertComic(marvel_comic_character_name,comic_appearance_1,comic_appearance_2,comic_appearance_3,
                                     comic_appearance_4,comic_appearance_5,comic_appearance_6,comic_appearance_7,
                                    comic_appearance_8,comic_appearance_9,comic_appearance_10,comic_appearance_11,
                                    comic_appearance_12,comic_appearance_13,comic_appearance_14,comic_appearance_15,
                                    comic_appearance_16,comic_appearance_17,comic_appearance_18,comic_appearance_19,
                                    comic_appearance_20,comic_appearance_21,comic_appearance_22,comic_appearance_23,
                                    comic_appearance_24,comic_appearance_25,comic_appearance_26,comic_appearance_27,
                                    comic_appearance_28,comic_appearance_29,comic_appearance_30,comic_appearance_31,
                                    comic_appearance_32,comic_appearance_33,comic_appearance_34,comic_appearance_35
                                    );
    }

    @GetMapping("/getcharacterbyid")
    public ResponseEntity<CharacterDto> getCharacterById(@RequestParam("id") Long characterId){
        CharacterDto characterDto = characterService.getCharacterById(characterId);
        return ResponseEntity.ok(characterDto);
    }
}
