package com.example.marvelCharacters.Comic.Service;

import com.example.marvelCharacters.Comic.Dto.ComicDto;
import java.util.List;

public interface ComicService {

    ComicDto createComic(ComicDto comicDto);

    ComicDto getComicById(Long lp);
    List<ComicDto> getAllComic();

    ComicDto updateComic(Long lp,
                         String comic_name,
                         String active_years,
                         String issue_title,
                         String publish_date,
                         String issue_description,
                         String penciler,
                         String writer,
                         String cover_artist,
                         String imprint,
                         String format,
                         String rating,
                         String price,
                         ComicDto updatedComic);

    void deleteComic(Long lp);
}
