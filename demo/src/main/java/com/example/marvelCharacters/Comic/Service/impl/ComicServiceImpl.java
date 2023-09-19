package com.example.marvelCharacters.Comic.Service.impl;

import com.example.marvelCharacters.Character.Exception.ResourceNotFoundException;
import com.example.marvelCharacters.Character.Mapper.CharacterMapper;
import com.example.marvelCharacters.Comic.Dto.ComicDto;
import com.example.marvelCharacters.Comic.Entity.Comic;
import com.example.marvelCharacters.Comic.Mapper.ComicMapper;
import com.example.marvelCharacters.Comic.Repository.ComicRepository;
import com.example.marvelCharacters.Comic.Service.ComicService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ComicServiceImpl implements ComicService {

    private ComicRepository comicRepository;

    public ComicDto createComic(ComicDto comicDto){
        Comic comic = ComicMapper.mapToComic(comicDto);
        Comic savedComic = comicRepository.save(comic);
        return ComicMapper.mapToComicDto(savedComic);
    }

    @Override
    public ComicDto getComicById(Long lp) {
        Comic comic = comicRepository.findById(lp)
                .orElseThrow( () ->
                        new ResourceNotFoundException("Comic with provided id is not exist's" + lp));
        return ComicMapper.mapToComicDto(comic);
    }

    @Override
    public List<ComicDto> getAllComic() {
        List<Comic> comics = comicRepository.findAll();
        return comics.stream().map((comic) -> ComicMapper.mapToComicDto(comic))
                .collect(Collectors.toList());
    }

    @Override
    public ComicDto updateComic(Long lp,
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
                                ComicDto updatedComic) {
        Comic comic = comicRepository.findById(lp).orElseThrow(
                () -> new ResourceNotFoundException("Comic with provided id is not exist's" + lp)
        );

        comic.setComic_name(updatedComic.getComic_name());
        comic.setActive_years(updatedComic.getActive_years());
        comic.setIssue_title(updatedComic.getIssue_title());
        comic.setPublish_date(updatedComic.getPublish_date());
        comic.setIssue_description(updatedComic.getIssue_description());
        comic.setPenciler(updatedComic.getPenciler());
        comic.setWriter(updatedComic.getWriter());
        comic.setCover_artist(updatedComic.getCover_artist());
        comic.setImprint(updatedComic.getImprint());
        comic.setFormat(updatedComic.getFormat());
        comic.setRating(updatedComic.getRating());
        comic.setPrice(updatedComic.getPrice());

        Comic updateComicObj = comicRepository.save(comic);
        return ComicMapper.mapToComicDto(updateComicObj);
    }

    @Override
    public void deleteComic(Long lp) {
        Comic comic = comicRepository.findById(lp).orElseThrow(
                () -> new ResourceNotFoundException("Comic with provided id is not exist's" + lp)
        );

        comicRepository.deleteById(lp);
    }
}
