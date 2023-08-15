package com.example.marvelCharacters.Character;

import com.example.marvelCharacters.Comic.Comic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CharacterRepository extends JpaRepository<CharacterController,Long> {
    //Jeszcze przydałoby się zliczać ilość wystąpień dla wierszy w których występują
    //dane komiksy
    @Query(
            value = "SELECT" +
                    "marvel_comic_character_name" +
                    "FROM marvel_super_heroes " +
                    "WHERE comic_appearance_1 ~*'comic'" +
                    "OR comic_appearance_2 ~*'comic'" +
                    "OR comic_appearance_3 ~*'comic'" +
                    "OR comic_appearance_4 ~*'comic'" +
                    "OR comic_appearance_5 ~*'comic'" +
                    "OR comic_appearance_6 ~*'comic'" +
                    "OR comic_appearance_7 ~*'comic'" +
                    "OR comic_appearance_8 ~*'comic'" +
                    "OR comic_appearance_9 ~*'comic'" +
                    "OR comic_appearance_10 ~*'comic'" +
                    "OR comic_appearance_11 ~*'comic'" +
                    "OR comic_appearance_12 ~*'comic'" +
                    "OR comic_appearance_13 ~*'comic'" +
                    "OR comic_appearance_14 ~*'comic'" +
                    "OR comic_appearance_15 ~*'comic'" +
                    "OR comic_appearance_16 ~*'comic'" +
                    "OR comic_appearance_17 ~*'comic'" +
                    "OR comic_appearance_18 ~*'comic'" +
                    "OR comic_appearance_19 ~*'comic'" +
                    "OR comic_appearance_20 ~*'comic'" +
                    "OR comic_appearance_21 ~*'comic'" +
                    "OR comic_appearance_22 ~*'comic'" +
                    "OR comic_appearance_23 ~*'comic'" +
                    "OR comic_appearance_24 ~*'comic'" +
                    "OR comic_appearance_25 ~*'comic'" +
                    "OR comic_appearance_26 ~*'comic'" +
                    "OR comic_appearance_27 ~*'comic'" +
                    "OR comic_appearance_28 ~*'comic'" +
                    "OR comic_appearance_29 ~*'comic'" +
                    "OR comic_appearance_30 ~*'comic'" +
                    "OR comic_appearance_31 ~*'comic'" +
                    "OR comic_appearance_32 ~*'comic'" +
                    "OR comic_appearance_33 ~*'comic'" +
                    "OR comic_appearance_34 ~*'comic'" +
                    "OR comic_appearance_35 ~*'comic';",
            nativeQuery = true
    )
    List<CharacterController> findCharacterByComic(@Param("comic") String comic);

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
                    "com ic_appearance_23," +
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
                    "FROM marvel_uper_heroes WHERE marvel_comic_character_name ~*name;",
            nativeQuery = true
    )
    List<CharacterController> findComicsByCharacterName(@Param("name")String name);


    //do dokończenia

//    @Query(value = "INSERT INTO marvel_super_heroes (marvel_comic_character_name,comic_appearance_1,comic_appearance_2," +
//            "comic_appearance_3,comic_appearance_4,comic_appearance_5," +
//            "comic_appearance_6,comic_appearance_7,comic_appearance_8," +
//            "comic_appearance_9,comic_appearance_10,comic_appearance_11," +
//            "comic_appearance_12,comic_appearance_13,comic_appearance_14," +
//            "comic_appearance_15,comic_appearance_16,comic_appearance_17," +
//            "comic_appearance_18,comic_appearance_19,comic_appearance_20," +
//            "comic_appearance_21,comic_appearance_22,comic_appearance_23," +
//            "comic_appearance_24,comic_appearance_25,comic_appearance_26," +
//            "comic_appearance_27,comic_appearance_28,comic_appearance_29," +
//            "comic_appearance_30,comic_appearance_31,comic_appearance_32," +
//            "comic_appearance_33,comic_appearance_34,comic_appearance_35)" +
//            "SELECT :marvel_comic_character_name," +
//            " :comic_appearance_1, :comic_appearance_2, :comic_appearance_3," +
//            " :comic_appearance_4, :comic_appearance_5, :comic_appearance_6," +
//            " :comic_appearance_7, :comic_appearance_8, :comic_appearance_9," +
//            " :comic_appearance_10, :comic_appearance_11, :comic_appearance_12," +
//            " :comic_appearance_13, :comic_appearance_14, :comic_appearance_15," +
//            " :comic_appearance_16, :comic_appearance_17, :comic_appearance_18," +
//            " :comic_appearance_19, :comic_appearance_20, :comic_appearance_21," +
//            " :comic_appearance_22, :comic_appearance_23, :comic_appearance_24," +
//            " :comic_appearance_25, :comic_appearance_26, :comic_appearance_27," +
//            " :comic_appearance_28, :comic_appearance_29, :comic_appearance_30," +
//            " :comic_appearance_31, :comic_appearance_32, :comic_appearance_33," +
//            " :comic_appearance_34, :comic_appearance_35" +
//            "FROM users u.id = :userid AND u.status = 'admin'")
//    List<Comic> insertComic(@Param("marvel_comic_character")String marvel_comic_character,
//                            @Param("comic_appearance_1")String comic_appearance_1,
//                            @Param("comic_appearance_1")String comic_appearance_2,
//                            @Param("comic_appearance_3")String comic_appearance_3,
//                            @Param("comic_appearance_4")String comic_appearance_4,
//                            @Param("comic_appearance_5")String comic_appearance_5,
//                            @Param("comic_appearance_6")String comic_appearance_6,
//                            @Param("comic_appearance_7")String comic_appearance_7,
//                            @Param("comic_appearance_8")String comic_appearance_8,
//                            @Param("comic_appearance_9")String comic_appearance_9,
//                            @Param("comic_appearance_10")String comic_appearance_10,
//                            @Param("comic_appearance_11")String comic_appearance_11,
//                            @Param("comic_appearance_12")String comic_appearance_12,
//                            @Param("comic_appearance_13")String comic_appearance_13,
//                            @Param("comic_appearance_14")String comic_appearance_14,
//                            @Param("comic_appearance_15")String comic_appearance_15,
//                            @Param("comic_appearance_16")String comic_appearance_16,
//                            @Param("comic_appearance_17")String comic_appearance_17,
//                            @Param("comic_appearance_18")String comic_appearance_18,
//                            @Param("comic_appearance_19")String comic_appearance_19,
//                            @Param("comic_appearance_20")String comic_appearance_20,
//                            @Param("comic_appearance_21")String comic_appearance_21,
//                            @Param("comic_appearance_22")String comic_appearance_22,
//                            @Param("comic_appearance_23")String comic_appearance_23,
//                            @Param("comic_appearance_24")String comic_appearance_24,
//                            @Param("comic_appearance_25")String comic_appearance_25,
//                            @Param("comic_appearance_26")String comic_appearance_26,
//                            @Param("comic_appearance_27")String comic_appearance_27,
//                            @Param("comic_appearance_28")String comic_appearance_28,
//                            @Param("comic_appearance_29")String comic_appearance_29,
//                            @Param("comic_appearance_30")String comic_appearance_30,
//                            @Param("comic_appearance_31")String comic_appearance_31,
//                            @Param("comic_appearance_32")String comic_appearance_32,
//                            @Param("comic_appearance_33")String comic_appearance_33,
//                            @Param("comic_appearance_34")String comic_appearance_34,
//                            @Param("comic_appearance_35")String comic_appearance_35,
//                            @Param("userid")String userid,
//                            @Param("status")String status);
}
