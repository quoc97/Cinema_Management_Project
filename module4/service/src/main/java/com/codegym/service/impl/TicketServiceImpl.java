package com.codegym.service.impl;

import com.codegym.dao.entity.Ticket;
import com.codegym.dao.entity.User;
import com.codegym.dao.repository.TicketRepository;
import com.codegym.dao.repository.UserRepository;
import com.codegym.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
@Service
public class TicketServiceImpl implements TicketService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private TicketRepository ticketRepository;
    @Override
    public List<Ticket> findAll() {
        return (List<Ticket>) ticketRepository.findAll();
    }
    @Override
    public List<Ticket> findByUser(Long idUser) {
        User user = userRepository.findByIdUser(idUser);
        List<Ticket> ticket = ticketRepository.findByUser(user);
        return ticket;
    }
    @Override
    public List<Ticket> findByUserAndStatusIs(Long idUser,String Status) {
        User user = userRepository.findByIdUser(idUser);
        List<Ticket> ticket = ticketRepository.findByUserAndStatusIs(user,"Da Huy Ve");
        return ticket;
    }
    @Override
    public List<Ticket> findByUserAndStatusIsNot(Long idUser, String status) {
        User user = userRepository.findByIdUser(idUser);
        List<Ticket> ticket = ticketRepository.findByUserAndStatusIsNot(user,"Da Huy Ve");
        return ticket;
    }
    @Override
    public List<Ticket> findByUserAndDateOrderTicketIsBetween(Long idUser, Date starDate, Date endDate) {
        User user = userRepository.findByIdUser(idUser);
        List<Ticket> ticket = ticketRepository.findByUserAndDateOrderTicketIsBetween(user,starDate,endDate);
        return ticket;
    }
//    @Override
//    public List<Ticket> findByUserAndDateOrderTicket(Long idUser, Date starDate, Date endDate) {
//        User user = userRepository.findByIdUser(idUser);
//        List<Ticket> ticket = ticketRepository.findByUserAndDateOrderTicket(user,starDate,endDate);
//        return ticket;
//    }
//    @Override
//    public List<Ticket> findIdUserDateOrderPoint(Long idUser,Date startDate,Date endDate){
//        User user = userRepository.findByIdUser(idUser);
//        List<Ticket> ticket = ticketRepository.findIdUserDateOrderPoint(user,startDate,endDate);
//        return ticket;
//    }
//@Override
//public List<Ticket> findByUserAndDateOrderTicketBetween(Long idUser, String starDate, String endDate) {
//    User user = userRepository.findByIdUser(idUser);
//    SimpleDateFormat sd  =  new SimpleDateFormat("MM/dd/yyyy");
////    Date starDate1 = sd.parse(starDate);
//    List<Ticket> ticket = ticketRepository.findByUserAndDateOrderTicketBetween(user,starDate,endDate);
//    return ticket;
//}
}