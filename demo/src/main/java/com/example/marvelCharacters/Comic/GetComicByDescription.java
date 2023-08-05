package com.example.marvelCharacters.Comic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(path = "api/v1/comic/bydesc")
public class GetComicByDescription {
    @Autowired
    private ComicRepository comic;

    public List<Comic> findComicByDescription(@RequestParam(value = "desc") String desc){

        List<Comic> comix = comic.findComicByDescription(desc);

        return comix;
    }
}
