package com.example.marvelCharacters.Comic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/comic/byname")
public class GetComicByName {
    @Autowired
    private ComicRepository comix;

    public List<Comic> findComicByName(@RequestParam(value="name" , defaultValue = "Hulk") String name ){

        List<Comic> comics = comix.findComicByName(name);

        return comics;
    }

}
