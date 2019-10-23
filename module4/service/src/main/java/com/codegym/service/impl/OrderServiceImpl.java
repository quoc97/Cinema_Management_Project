//package com.codegym.service.impl;
//
//import com.codegym.dao.entity.Movie;
//import com.codegym.dao.entity.Order;
//import com.codegym.dao.repository.OrderRepository;
//import com.codegym.service.OrderService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class OrderServiceImpl implements OrderService {
//    @Autowired
//    private OrderRepository orderRepository;
//
//    @Override
//    public List<Order> findAllByDeletedIsFalse() {
//        return orderRepository.findAll();
//    }
//
//
////    @Override
////    public Order findById(int id) {
////        return orderRepository.findAllByIdOrder( id );
////    }
//
////
////    @Override
////    public void updateOrder (Order order) {
////        Order order1 = orderRepository.findAllByIdOrder(order.getIdOrder());
////        order1.setIdOrder(order.getIdOrder());
////        order1.setAccount(order.getAccount());
////            order1.setMovie(order.getMovie());
////            order1.setTime(order.getTime());
////            order1.setTotalPrice(order.getTotalPrice());
////
////           orderRepository.save( order1 ) ;
////        }
////
////    @Override
////    public void save(Order order) {
////     Order order2  = new Order(  );
////     order2.setIdOrder( order.getIdOrder());
////     order2.setTotalPrice( order.getTotalPrice() );
////     order2.setTime( order.getTime() );
////     order2.setMovie( order.getMovie() );
////     order2.setAccount( order.getAccount() );
////     orderRepository.save( order2 );
////    }
//
//}
