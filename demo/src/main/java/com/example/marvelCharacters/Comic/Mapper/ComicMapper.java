package com.example.marvelCharacters.Comic.Mapper;
import com.example.marvelCharacters.Character.dto.CharacterDto;
import com.example.marvelCharacters.Comic.Dto.ComicDto;
import com.example.marvelCharacters.Comic.Entity.Comic;

public class ComicMapper {
    public static ComicDto mapToComicDto(Comic comic){
        return new ComicDto(
                comic.getLp(),
                comic.getComic_name(),
                comic.getActive_years(),
                comic.getIssue_title(),
                comic.getIssue_description(),
                comic.getPublish_date(),
                comic.getIssue_description(),
                comic.getWriter(),
                comic.getCover_artist(),
                comic.getImprint(),
                comic.getFormat(),
                comic.getRating(),
                comic.getPrice()
        );
    }


    public static Comic mapToComic(ComicDto comicDto){
        return new Comic(
                comicDto.getLp(),
                comicDto.getComic_name(),
                comicDto.getActive_years(),
                comicDto.getIssue_title(),
                comicDto.getPublish_date(),
                comicDto.getIssue_description(),
                comicDto.getPenciler(),
                comicDto.getWriter(),
                comicDto.getCover_artist(),
                comicDto.getImprint(),
                comicDto.getFormat(),
                comicDto.getRating(),
                comicDto.getPrice()
            );
    }
}
