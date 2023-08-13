package com.example.marvelCharacters.Comic;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface ComicRepository extends JpaRepository<Comic,Long> {

    @Query(value = "SELECT " +
            "lp, comic_name, active_years, issue_title," +
            "publish_date, issue_description, penciler," +
            "writer, cover_artist, imprint," +
            "format, rating, price" +
            " FROM marvel_comics Where comic_name ~* :name ;",
            nativeQuery = true)
    List<Comic> findComicByName(@Param(value = "name") String name);

    @Query(value = "SELECT " +
            "lp, comic_name, active_years, issue_title," +
            "publish_date, issue_description, penciler," +
            "writer, cover_artist, imprint," +
            "format, rating, price" +
            " FROM marvel_comics Where comic_name ~* :date ;",
            nativeQuery = true)
    List<Comic> findComicByYear(@RequestParam(value = "date") String date);

    //Issue_Description
    @Query(value = "SELECT " +
            "lp, comic_name, active_years, issue_title," +
            "publish_date, issue_description, penciler," +
            "writer, cover_artist, imprint," +
            "format, rating, price" +
            " FROM marvel_comics Where comic_name ~* :desc ;",
            nativeQuery = true)
    List<Comic> findComicByDescription(@RequestParam(value = "desc") String desc);

    @Query(value = "SELECT " +
            "lp, comic_name, active_years, issue_title," +
            "publish_date, issue_description, penciler," +
            "writer, cover_artist, imprint," +
            "format, rating, price" +
            " FROM marvel_comics Where comic_name ~* :title ;",
            nativeQuery = true)
    List<Comic> findComicByIssueTitle(@RequestParam(value = "title") String title);

    @Query(value = "SELECT " +
            "lp, comic_name, active_years, issue_title," +
            "publish_date, issue_description, penciler," +
            "writer, cover_artist, imprint," +
            "format, rating, price" +
            " FROM marvel_comics Where comic_name ~* :date ;",
            nativeQuery = true)
    List<Comic> findComicByPublishDate(@RequestParam(value = "date") String date);

    //dodawanie komiksów do bazy danych
    //ciągle w trakcie naprawiania
    //do zamiany na dwa mniejsze pod zapytania
//    @Transactional
//    @Query(value = "INSERT INTO marvel_comics (comic_name, active_years, issue_title," +
//            " publish_date, issue_description, penciler, writer, cover_artist," +
//            " imprint, format, rating, price) " +
//            " SELECT :comic_name, :active_years, :issue_title, " +
//            " :publish_date, :issue_description,:penciler, " +
//            " :writer, :cover_artist, :imprint, " +
//            " :format, :rating, :price" +
//            "FROM users" +
//            "WHERE login= :log AND status='admin'",
//            nativeQuery = true
//            )
//    List<Comic> insertComic(@Param("comic_name")String comic_name,
//                            @Param("active_years")String active_years,
//                            @Param("issue_title")String issue_title,
//                            @Param("publish_date")String publish_date,
//                            @Param("issue_description")String issue_description,
//                            @Param("penciler")String penciler,
//                            @Param("writer")String writer,
//                            @Param("cover_artist")String cover_artist,
//                            @Param("imprint")String imprint,
//                            @Param("format")String format,
//                            @Param("rating")String rating,
//                            @Param("price")String price,
//                            @Param("log")String log);
}
