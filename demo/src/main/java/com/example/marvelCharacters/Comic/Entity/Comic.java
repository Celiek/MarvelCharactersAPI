package com.example.marvelCharacters.Comic.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="marvel_comics")
public class Comic {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long lp;
    private String comic_name;
    private String active_years;
    private String issue_title;
    private String publish_date;
    private String issue_description;
    private String penciler;
    private String writer;
    private String cover_artist;
    private String imprint;
    private String format;
    private String rating;
    private String price;
}
