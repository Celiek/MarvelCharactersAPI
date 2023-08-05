package com.example.marvelCharacters.Comic;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestParam;
import scala.util.parsing.combinator.testing.Str;

import java.util.List;

public interface ComicRepository extends JpaRepository<Comic,Long> {

    @Query(value = "SELECT " +
            "comic_name," +
            "active_years," +
            "issue_title," +
            "publish_date," +
            "issue_description," +
            "penciler," +
            "writer," +
            "cover_artist," +
            "imprint," +
            "format," +
            "rating," +
            "price" +
            "FROM \"Marvel_Comics\" Where comic_name ~* 'name'; ",
    nativeQuery = true)
    List<Comic> findComicByName(@Param(value = "name")String name);

    @Query(value = "SELECT" +
            "comic_name," +
            "active_years," +
            "issue_title," +
            "publish_date," +
            "issue_description," +
            "penciler," +
            "writer," +
            "cover_artist," +
            "imprint," +
            "format," +
            "rating," +
            "price" +
            "FROM \"Marvel_Comics\" Where publish_date ~* 'date';",
            nativeQuery = true)
    List<Comic> findComicByYear(@RequestParam(value = "date")String date);

    //Issue_Description
    @Query( value="SELECT" +
            "comic_name," +
            "active_years," +
            "issue_title," +
            "publish_date," +
            "issue_description," +
            "penciler," +
            "writer," +
            "cover_artist," +
            "imprint," +
            "format," +
            "rating," +
            "price" +
            "FROM \"Marvel_Comics\" Where issue_description ~* 'desc';" ,
            nativeQuery = true)
    List<Comic> findComicByDescription(@RequestParam(value = "desc")String desc);

    @Query(value="SELECT" +
            "comic_name," +
            "active_years," +
            "issue_title," +
            "publish_date," +
            "issue_description," +
            "penciler," +
            "writer," +
            "cover_artist," +
            "imprint," +
            "format," +
            "rating," +
            "price" +
            "FROM \"Marvel_Comics\" Where issue_title ~* 'title';" ,
            nativeQuery = true)
    List<Comic> findComicByIssueTitle(@RequestParam(value = "title")String title);

    @Query(value="SELECT" +
            "comic_name," +
            "active_years," +
            "issue_title," +
            "publish_date," +
            "issue_description," +
            "penciler," +
            "writer," +
            "cover_artist," +
            "imprint," +
            "format," +
            "rating," +
            "price" +
            "FROM \"Marvel_Comics\" Where publish_date ~* 'date';" ,
            nativeQuery = true)
    List<Comic> findComicByPublishDate(@RequestParam(value = "date")String date);
}
