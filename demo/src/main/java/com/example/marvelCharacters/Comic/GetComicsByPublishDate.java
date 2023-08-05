package com.example.marvelCharacters.Comic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/comic/bydate")
public class GetComicsByPublishDate {
    @Autowired
    private ComicRepository comicRepository;

    public List<Comic> findComicByPublishDate(@RequestParam(value = "date")String date){
        List<Comic> comics = comicRepository.findComicByPublishDate(date);

        return comics;
    }
}
