package com.example.marvelCharacters.Comic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/comic")
public class ComicController {

    private final ComicRepository comicRepository;
    @Autowired
    public ComicController(ComicRepository comicRepository) {
        this.comicRepository = comicRepository;
    }

    @GetMapping("/byname")
    List<Comic> findComicByName(@Param(value = "name")String name){

        return comicRepository.findComicByName(name);
    }

    @GetMapping("/byyear")
    List<Comic> findComicByYear(@Param(value = "date")String date){
        return comicRepository.findComicByYear(date);
    }

    @GetMapping("/bydesc")
    List<Comic> findComicByDescription(@Param(value="desc")String desc){
        return comicRepository.findComicByDescription(desc);
    }

    @GetMapping("/byissue")
    List<Comic> findComicByIssueTitle(@Param(value="issue")String issue){
        return comicRepository.findComicByIssueTitle(issue);
    }

    @GetMapping("/bypublishdate")
    List<Comic> findComicByPublishDate(@Param(value = "date")String date){
        return comicRepository.findComicByPublishDate(date);
    }

    //do dokończenia
//    @PostMapping("/insertcomic")
//    List<Comic> insertComic(){
//        return findComicByIssueTitle()
//    }

}
