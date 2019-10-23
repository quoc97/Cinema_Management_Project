package com.codegym.service;

import com.codegym.dao.entity.Ticket;
import com.codegym.dao.entity.User;
import java.util.Date;
import java.util.List;
public interface TicketService {
    List<Ticket> findAll();
    List<Ticket> findByUser (Long idUser);
    List<Ticket> findByUserAndStatusIs (Long idUser, String Status);
    List<Ticket> findByUserAndStatusIsNot(Long idUser,String status);
    //    List<Ticket> findByUserAndDateOrderTicketBetween(Long idUser, String starDate, String endDate);
//    List<Ticket> findByUserAndDateOrderTicketBetween(Long idUser, Date starDate, Date endDate);
    List<Ticket> findByUserAndDateOrderTicketIsBetween(Long idUser, Date starDate, Date endDate);
//    List<Ticket> findByUserAndDateOrderTicket(Long idUser, Date starDate, Date endDate);
//    List<Ticket> findIdUserDateOrderPoint(Long idUser,Date starDate,Date endDate);
}