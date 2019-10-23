package com.codegym.dao.entity;

import javax.persistence.*;
import java.util.Set;

@Table(name = "account" ,schema = "cinema_module4")
@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id_account")

    private Integer idAccount;
    private Integer idRole;
    private String user;
    private String password;
    private  String phone;
    private String author;
    private  String cateloryMovie;
    private String CMND;
    private String duration;
    private String TicketSpecials;
    private  String membershipCode;

    public Account() {
    }

    public Account(Integer idRole, String user, String password, String phone, String author, String cateloryMovie, String CMND, String duration, String ticketSpecials, String membershipCode) {
        this.idRole = idRole;
        this.user = user;
        this.password = password;
        this.phone = phone;
        this.author = author;
        this.cateloryMovie = cateloryMovie;
        this.CMND = CMND;
        this.duration = duration;
        TicketSpecials = ticketSpecials;
        this.membershipCode = membershipCode;
    }

    public Integer getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(Integer idAccount) {
        this.idAccount = idAccount;
    }

    public Integer getIdRole() {
        return idRole;
    }

    public void setIdRole(Integer idRole) {
        this.idRole = idRole;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCateloryMovie() {
        return cateloryMovie;
    }

    public void setCateloryMovie(String cateloryMovie) {
        this.cateloryMovie = cateloryMovie;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getTicketSpecials() {
        return TicketSpecials;
    }

    public void setTicketSpecials(String ticketSpecials) {
        TicketSpecials = ticketSpecials;
    }

    public String getMembershipCode() {
        return membershipCode;
    }

    public void setMembershipCode(String membershipCode) {
        this.membershipCode = membershipCode;
    }
    //    public Account(Integer idRole, String user, String password, String phone, String author, String cateloryMovie, String name, String duration) {
//        this.idRole = idRole;
//      this.user = user;
//        this.password = password;
//        this.phone = phone;
//        this.author = author;
//        this.cateloryMovie = cateloryMovie;
//        this.name = name;
//        this.duration = duration;
//    }
//
//    public Integer getIdAccount() {
//        return idAccount;
//    }
//
//    public void setIdAccount(Integer idAccount) {
//        this.idAccount = idAccount;
//    }
//
//    public Integer getIdRole() {
//        return idRole;
//    }
//
//    public void setIdRole(Integer idRole) {
//        this.idRole = idRole;
//    }
//
//    public String getUser() {
//        return user;
//    }
//
//    public void setUser(String user) {
//        this.user = user;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//      public String getPhone() {
//        return phone;
//    }
//
//    public void setActor(String actor) {
//        this.phone = phone;
//    }
//
//    public String getAuthor() {
//        return author;
//    }
//
//    public void setAuthor(String author) {
//        this.author = author;
//    }
//
//    public String getCateloryMovie() {
//        return cateloryMovie;
//    }
//
//    public void setCateloryMovie(String cateloryMovie) {
//        this.cateloryMovie = cateloryMovie;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getDuration() {
//        return duration;
//    }
//
//    public void setDuration(String  duration) {
//        this.duration = duration;
//    }
//
//
//    public Account(){
//
//
//    }

}


