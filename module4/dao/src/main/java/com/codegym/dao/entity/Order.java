//package com.codegym.dao.entity;
//
//import javax.persistence.*;
//import java.util.List;
//import java.util.Set;
//
//@Entity
//@Table(name = "`order`", schema = "cinema_module4")
//public class Order {
//    @Id
//    @Column(name = "`id_order`")
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer idOrder;
//    //    @Column(name = "`id_account`")
////   private Integer idAccount;
////   @Column(name = "`id_movie`")
////    private Integer idMovie;
//    @Column(name = "`total_price`")
//    private Integer totalPrice;
//
//    @ManyToOne
//    @JoinColumn(name = "id_movie")
//    private Movie movie;
//
//    @ManyToOne
//    private Account account;
//    @ManyToOne
//    private Time time;
//
//    public Order( Movie movie,Integer totalPrice, Account account, Time time) {
//        this.totalPrice = totalPrice;
//        this.movie = movie;
//        this.account = account;
//        this.time = time;
//    }
//
//    public Order() {
//    }
//
//
//    public Movie getMovie() {
//        return movie;
//    }
//
//    public void setMovie(Movie movie) {
//        this.movie = movie;
//    }
//
//    public Time getTime() {
//        return time;
//    }
//
//    public void setTime(Time time) {
//        this.time = time;
//    }
//
//    public Integer getIdOrder() {
//        return idOrder;
//    }
//
//    public void setIdOrder(Integer idOrder) {
//        this.idOrder = idOrder;
//    }
//
//    public Integer getTotalPrice() {
//        return totalPrice;
//    }
//
//    public void setTotalPrice(Integer totalPrice) {
//        this.totalPrice = totalPrice;
//    }
//
//    public Account getAccount() {
//        return account;
//    }
//
//    public void setAccount(Account account) {
//        this.account = account;
//    }
//
//}
