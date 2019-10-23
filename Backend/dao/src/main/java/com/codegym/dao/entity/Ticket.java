package com.codegym.dao.entity;

import javax.persistence.*;
import java.util.Date;
//import java.sql.Date;
@Entity
@Table(name = "ticket")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_ticket")
    private Long idTicket;
    @Column(name = "name_ticket")
    private String nameTicket;
    @Temporal(TemporalType.DATE)
    @Column(name = "date_order_ticket")
    private Date dateOrderTicket;
    @Column(name = "price_ticket")
    private int priceTicket;
    @Column(name = "status")
    private String status;
    @Column(name = "plus_point")
    private int plusPoint;
    @Column(name = "use_point")
    private int usePoint;
    @ManyToOne
    @JoinColumn(name = "ticket_id_user")
    private User user;
    public Ticket(){
    }
    public Ticket(String nameTicket, Date dateOrderTicket, int priceTicket, String status, int plusPoint, int usePoint, User user) {
        this.nameTicket = nameTicket;
        this.dateOrderTicket = dateOrderTicket;
        this.priceTicket = priceTicket;
        this.status = status;
        this.plusPoint = plusPoint;
        this.usePoint = usePoint;
        this.user = user;
    }
    public Long getIdTicket() {
        return idTicket;
    }
    public void setIdTicket(Long idTicket) {
        this.idTicket = idTicket;
    }
    public String getNameTicket() {
        return nameTicket;
    }
    public void setNameTicket(String nameTicket) {
        this.nameTicket = nameTicket;
    }
    public Date getDateOrderTicket() {
        return dateOrderTicket;
    }
    public void setDateOrderTicket(Date dateOrderTicket) {
        this.dateOrderTicket = dateOrderTicket;
    }
    public int getPriceTicket() {
        return priceTicket;
    }
    public void setPriceTicket(int priceTicket) {
        this.priceTicket = priceTicket;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public int getPlusPoint() {
        return plusPoint;
    }
    public void setPlusPoint(int plusPoint) {
        this.plusPoint = plusPoint;
    }
    public int getUsePoint() {
        return usePoint;
    }
    public void setUsePoint(int usePoint) {
        this.usePoint = usePoint;
    }
}