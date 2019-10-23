//package com.codegym.web_service.controller;
//
//import com.codegym.dao.entity.Movie;
//import com.codegym.dao.entity.Order;
////import com.codegym.service.MovieService;
//import com.codegym.service.OrderService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@CrossOrigin(origins = "*", allowedHeaders = "*")
//@RequestMapping("order")
//public class OrderController {
//
//    @Autowired
//    public OrderService orderService;
////    @Autowired
////    public MovieService movieService;
//
//
//    @GetMapping("/listOrder")
//    public List<Order> getAllArtist() {
//        List<Order> orders = orderService.findAllByDeletedIsFalse();
//        System.out.println( orders.get( 0 ).getTotalPrice() );
//        return orders;
//    }
//
////    @GetMapping("/getAll/{id}")
////    public ResponseEntity<?> getAllComment(@PathVariable int id){
//////        List<Comment> comments = commentService.getAllComment(id);
////        List<Movie> comments = getAllComment.findCommentBySong_Id(id);
////        return ResponseEntity.ok(comments);
////}
////
////@GetMapping("/update/{idOrder}")
////public ResponseEntity<Order> updateOrder(@PathVariable(value = "idOrder") Long idOrder
////        ,@RequestBody Order order){
////    order.setIdOrder( Math.toIntExact( idOrder ) );
////    orderService.updateOrder(order);
////    return ResponseEntity.ok(order);
////}
//
////@GetMapping(value={"/{name}"})
////public ResponseEntity<?> getNameMovie(@PathVariable("name") String name) {
////    List<Movie> movies  = movieService.getNameMovie( name );
////    System.out.println( movies.get( 0 ).getNameMovie() );
////    return ResponseEntity.ok(movies);
////}
//
//}