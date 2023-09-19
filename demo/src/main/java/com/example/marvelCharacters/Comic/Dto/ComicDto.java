package com.example.marvelCharacters.Comic.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ComicDto {
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
