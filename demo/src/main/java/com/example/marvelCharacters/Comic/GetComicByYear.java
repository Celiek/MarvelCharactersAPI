package com.example.marvelCharacters.Comic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/comic/byyear")
public class GetComicByYear {
    @Autowired
    private ComicRepository comic;

    public List<Comic> findComicByYear(@RequestParam(value = "date") String date){

        List<Comic> comics = findComicByYear(date);

        return comics;
    }
}
