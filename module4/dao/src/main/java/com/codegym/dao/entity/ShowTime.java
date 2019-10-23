package com.codegym.dao.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "show_time")
public class ShowTime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_show_time")
    private int idTime;
    @Column(name="id_movie")
    private int idMovie;
    @JsonFormat(pattern="dd/MM/yyyy", locale = "vi-VN", timezone = "Asia/Ho_Chi_Minh")
    @Column(name = "show_date")
    private Date showDate;
    @Column(name="id_time_frame")
    private String showTime;
    @Column(name="room")
    private String room;
    public ShowTime() {
    }
    public int getIdTime() {
        return idTime;
    }
    public void setIdTime(int idTime) {
        this.idTime = idTime;
    }
    public int getIdMovie() {
        return idMovie;
    }
    public void setIdMovie(int idMovie) {
        this.idMovie = idMovie;
    }
    public Date getShowDate() {
        return showDate;
    }
    public void setShowDate(Date showDate) {
        this.showDate = showDate;
    }
    public String getShowTime() {
        return showTime;
    }
    public void setShowTime(String showTime) {
        this.showTime = showTime;
    }
    public String getRoom() {
        return room;
    }
    public void setRoom(String room) {
        this.room = room;
    }
}