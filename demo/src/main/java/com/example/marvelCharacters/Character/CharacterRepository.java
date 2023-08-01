package com.example.marvelCharacters.Character;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CharacterRepository extends JpaRepository<Character,Long> {

    @Query(
            value = "",
            nativeQuery = true
    )
    List<Character> findCharacterByComic(@Param("name") String name);

    @Query(
            value = "SELECT" +
                    "marvel_comic_character_name," +
                    "comic_appearance_1," +
                    "comic_appearance_2," +
                    "comic_appearance_3," +
                    "comic_appearance_4," +
                    "comic_appearance_5," +
                    "comic_appearance_6," +
                    "comic_appearance_7," +
                    "comic_appearance_8," +
                    "comic_appearance_9," +
                    "comic_appearance_10," +
                    "comic_appearance_11," +
                    "comic_appearance_12," +
                    "comic_appearance_13," +
                    "comic_appearance_14," +
                    "comic_appearance_15," +
                    "comic_appearance_16," +
                    "comic_appearance_17," +
                    "comic_appearance_18," +
                    "comic_appearance_19," +
                    "comic_appearance_20," +
                    "comic_appearance_21," +
                    "comic_appearance_22," +
                    "comic_appearance_23," +
                    "comic_appearance_24," +
                    "comic_appearance_25," +
                    "comic_appearance_26," +
                    "comic_appearance_27," +
                    "comic_appearance_28," +
                    "comic_appearance_29," +
                    "comic_appearance_30," +
                    "comic_appearance_31," +
                    "comic_appearance_32," +
                    "comic_appearance_33," +
                    "comic_appearance_34," +
                    "comic_appearance_35" +
                    "FROM \"Marvel_Super_Heroes\" WHERE marvel_comic_character_name ~*name;",
            nativeQuery = true
    )
    List<Character> findComicsByCharacterName();
}
