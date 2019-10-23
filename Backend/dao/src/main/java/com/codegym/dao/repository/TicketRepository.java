package com.codegym.dao.repository;
import com.codegym.dao.entity.Ticket;
import com.codegym.dao.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.Date;
import java.util.List;
public interface TicketRepository extends JpaRepository<Ticket,Long> {
    List<Ticket> findByUser(User user);
    List<Ticket> findByUserAndStatusIs(User user,String status);
    List<Ticket> findByUserAndStatusIsNot(User user,String status);
    //    List<Ticket> findByUserAndDateOrderTicketBetween(User user, String starDate, String endDate);
    List<Ticket> findByUserAndDateOrderTicketIsBetween(User user, Date starDate, Date endDate);
//    @Query("Select nameTicket,plusPoint from Ticket where idTicket = 1 and (dateOrderTicket BETWEEN '2018-01-01' AND '2019-12-02')")
//    List<Ticket> findByUserAndDateOrderTicket(User user, Date starDate, Date endDate);
//    @Query("Select nameTicket,idUser,dateOrderTicket,plusPoint from Ticket t where t.idUser= :idUser " +
//            "AND (t.dateOrderTicket BETWEEN :dateOrderTicket AND :dateOrderTicket) ")
//    List<Ticket> findIdUserDateOrderPoint(User user,Date startDate,Date endDate);
}