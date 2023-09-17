package com.example.marvelCharacters.Character.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "marvel_super_heroes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Character {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    @Column(name = "l_p")
    private Long l_p;
    private String marvel_comic_character_name;
    private String comic_appearance_1;
    private String comic_appearance_2;
    private String comic_appearance_3;
    private String comic_appearance_4;
    private String comic_appearance_5;
    private String comic_appearance_6;
    private String comic_appearance_7;
    private String comic_appearance_8;
    private String comic_appearance_9;
    private String comic_appearance_10;
    private String comic_appearance_11;
    private String comic_appearance_12;
    private String comic_appearance_13;
    private String comic_appearance_14;
    private String comic_appearance_15;
    private String comic_appearance_16;
    private String comic_appearance_17;
    private String comic_appearance_18;
    private String comic_appearance_19;
    private String comic_appearance_20;
    private String comic_appearance_21;
    private String comic_appearance_22;
    private String comic_appearance_23;
    private String comic_appearance_24;
    private String comic_appearance_25;
    private String comic_appearance_26;
    private String comic_appearance_27;
    private String comic_appearance_28;
    private String comic_appearance_29;
    private String comic_appearance_30;
    private String comic_appearance_31;
    private String comic_appearance_32;
    private String comic_appearance_33;
    private String comic_appearance_34;
    private String comic_appearance_35;

    /*public Character(String marvel_comic_character_name, String comic_appearance_1, String comic_appearance_2, String comic_appearance_3, String comic_appearance_4, String comic_appearance_5, String comic_appearance_6, String comic_appearance_7, String comic_appearance_8, String comic_appearance_9, String comic_appearance_10, String comic_appearance_11, String comic_appearance_12, String comic_appearance_13, String comic_appearance_14, String comic_appearance_15, String comic_appearance_16, String comic_appearance_17, String comic_appearance_18, String comic_appearance_19, String comic_appearance_20, String comic_appearance_21, String comic_appearance_22, String comic_appearance_23, String comic_appearance_24, String comic_appearance_25, String comic_appearance_26, String comic_appearance_27, String comic_appearance_28, String comic_appearance_29, String comic_appearance_30, String comic_appearance_31, String comic_appearance_32, String comic_appearance_33, String comic_appearance_34, String comic_appearance_35) {
        this.marvel_comic_character_name = marvel_comic_character_name;
        this.comic_appearance_1 = comic_appearance_1;
        this.comic_appearance_2 = comic_appearance_2;
        this.comic_appearance_3 = comic_appearance_3;
        this.comic_appearance_4 = comic_appearance_4;
        this.comic_appearance_5 = comic_appearance_5;
        this.comic_appearance_6 = comic_appearance_6;
        this.comic_appearance_7 = comic_appearance_7;
        this.comic_appearance_8 = comic_appearance_8;
        this.comic_appearance_9 = comic_appearance_9;
        this.comic_appearance_10 = comic_appearance_10;
        this.comic_appearance_11 = comic_appearance_11;
        this.comic_appearance_12 = comic_appearance_12;
        this.comic_appearance_13 = comic_appearance_13;
        this.comic_appearance_14 = comic_appearance_14;
        this.comic_appearance_15 = comic_appearance_15;
        this.comic_appearance_16 = comic_appearance_16;
        this.comic_appearance_17 = comic_appearance_17;
        this.comic_appearance_18 = comic_appearance_18;
        this.comic_appearance_19 = comic_appearance_19;
        this.comic_appearance_20 = comic_appearance_20;
        this.comic_appearance_21 = comic_appearance_21;
        this.comic_appearance_22 = comic_appearance_22;
        this.comic_appearance_23 = comic_appearance_23;
        this.comic_appearance_24 = comic_appearance_24;
        this.comic_appearance_25 = comic_appearance_25;
        this.comic_appearance_26 = comic_appearance_26;
        this.comic_appearance_27 = comic_appearance_27;
        this.comic_appearance_28 = comic_appearance_28;
        this.comic_appearance_29 = comic_appearance_29;
        this.comic_appearance_30 = comic_appearance_30;
        this.comic_appearance_31 = comic_appearance_31;
        this.comic_appearance_32 = comic_appearance_32;
        this.comic_appearance_33 = comic_appearance_33;
        this.comic_appearance_34 = comic_appearance_34;
        this.comic_appearance_35 = comic_appearance_35;
    }*/


}
