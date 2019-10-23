package com.codegym.dao.entity;

import javax.persistence.*;
@Entity
@Table (name="movie")
public class Movie {
    @Id
    @Column(name = "id_movie")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMovie;
    private String nameMovie;
    private String categoryMovie;
    private String actor;
    private String author;
    private String studioMovie;
    private String duration;
    private String content;
    private String imgMovie;
    private String trailerMovie;
    private String openingTime;

    @ManyToOne
    @JoinColumn(name = "id_show_time")
    private ShowTime showTime;
    public Movie() {
    }
    public Movie(String nameMovie, String categoryMovie, String actor, String author, String studioMovie, String duration, String content, String imgMovie, String trailerMovie, String openingTime) {
        this.nameMovie = nameMovie;
        this.categoryMovie = categoryMovie;
        this.actor = actor;
        this.author = author;
        this.studioMovie = studioMovie;
        this.duration = duration;
        this.content = content;
        this.imgMovie = imgMovie;
        this.trailerMovie = trailerMovie;
        this.openingTime = openingTime;
    }
    public int getIdMovie() {
        return idMovie;
    }
    public void setIdMovie(int idMovie) {
        this.idMovie = idMovie;
    }
    public String getNameMovie() {
        return nameMovie;
    }
    public void setNameMovie(String nameMovie) {
        this.nameMovie = nameMovie;
    }
    public String getCategoryMovie() {
        return categoryMovie;
    }
    public void setCategoryMovie(String categoryMovie) {
        this.categoryMovie = categoryMovie;
    }
    public String getActor() {
        return actor;
    }
    public void setActor(String actor) {
        this.actor = actor;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getStudioMovie() {
        return studioMovie;
    }
    public void setStudioMovie(String studioMovie) {
        this.studioMovie = studioMovie;
    }
    public String getDuration() {
        return duration;
    }
    public void setDuration(String duration) {
        this.duration = duration;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public String getImgMovie() {
        return imgMovie;
    }
    public void setImgMovie(String imgMovie) {
        this.imgMovie = imgMovie;
    }
    public String getTrailerMovie() {
        return trailerMovie;
    }
    public void setTrailerMovie(String trailerMovie) {
        this.trailerMovie = trailerMovie;
    }
    public String getOpeningTime() {
        return openingTime;
    }
    public void setOpeningTime(String openingTime) {
        this.openingTime = openingTime;
    }

    public ShowTime getShowTime() {
        return showTime;
    }

    public void setShowTime(ShowTime showTime) {
        this.showTime = showTime;
    }
}