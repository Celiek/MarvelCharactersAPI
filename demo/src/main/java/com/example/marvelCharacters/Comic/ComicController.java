package com.example.marvelCharacters.Comic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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


    @PostMapping("/insertcomic")
    List<Comic> insertComic(@Param(value = "comic_name")String comic_name,
                            @Param(value = "active_years")String active_years,
                            @Param(value = "issue_title")String issue_title,
                            @Param(value = "publish_date")String publish_date,
                            @Param(value = "issue_description")String issue_description,
                            @Param(value = "penciler")String penciler,
                            @Param(value = "writer")String writer,
                            @Param(value = "cover_artist")String cover_artist,
                            @Param(value = "imprint")String imprint,
                            @Param(value = "format")String format,
                            @Param(value = "rating")String rating,
                            @Param(value = "price")String price){

        return insertComic(comic_name,active_years,issue_title,publish_date,issue_description,penciler,
                                    writer,cover_artist,imprint,format,rating,price);
    }

}
