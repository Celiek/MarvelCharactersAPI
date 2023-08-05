package com.example.marvelCharacters.Comic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public class GetComicByIssueTitle {
    @Autowired
    private ComicRepository comicRepository;

    public List<Comic> findComicByIssueTitle(@RequestParam(value = "title")String title){
        List<Comic> comics = comicRepository.findComicByIssueTitle(title);

        return comics;
    }

}
