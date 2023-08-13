package com.example.marvelCharacters.Comic;

import jakarta.persistence.*;

@Entity
@Table(name="marvel_comics")
public class Comic {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long lp;
    private String comic_name;
    private String active_years;
    private String issue_title;
    private String publish_date;
    private String issue_description;
    private String penciler;
    private String writer;
    private String cover_artist;
    private String imprint;
    private String format;
    private String rating;
    private String price;

    public Comic(String comic_name, String active_years, String issue_title, String publish_date, String issue_description, String penciler, String writer, String cover_artist, String imprint, String format, String rating, String price) {
        this.comic_name = comic_name;
        this.active_years = active_years;
        this.issue_title = issue_title;
        this.publish_date = publish_date;
        this.issue_description = issue_description;
        this.penciler = penciler;
        this.writer = writer;
        this.cover_artist = cover_artist;
        this.imprint = imprint;
        this.format = format;
        this.rating = rating;
        this.price = price;
    }

    public Comic() {}

    public String getComic_name() {
        return comic_name;
    }

    public void setComic_name(String comic_name) {
        this.comic_name = comic_name;
    }

    public String getActive_years() {
        return active_years;
    }

    public void setActive_years(String active_years) {
        this.active_years = active_years;
    }

    public String getIssue_title() {
        return issue_title;
    }

    public void setIssue_title(String issue_title) {
        this.issue_title = issue_title;
    }

    public String getPublish_date() {
        return publish_date;
    }

    public void setPublish_date(String publish_date) {
        this.publish_date = publish_date;
    }

    public String getIssue_description() {
        return issue_description;
    }

    public void setIssue_description(String issue_description) {
        this.issue_description = issue_description;
    }

    public String getPenciler() {
        return penciler;
    }

    public void setPenciler(String penciler) {
        this.penciler = penciler;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getCover_artist() {
        return cover_artist;
    }

    public void setCover_artist(String cover_artist) {
        this.cover_artist = cover_artist;
    }

    public String getImprint() {
        return imprint;
    }

    public void setImprint(String imprint) {
        imprint = imprint;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        format = format;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        rating = rating;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        price = price;
    }
}
