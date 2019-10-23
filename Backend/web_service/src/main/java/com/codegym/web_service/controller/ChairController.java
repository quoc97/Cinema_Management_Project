package com.codegym.web_service.controller;

import com.codegym.dao.entity.Chair;
import com.codegym.service.ChairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
@CrossOrigin(origins = "", allowedHeaders = "")
public class ChairController {
    @Autowired
    public ChairService chairService;
    @GetMapping(value = {"/getchairs"})
    private ResponseEntity<?> getChairs(){
        List<Chair> chairs =chairService.getChairs();
        return ResponseEntity.ok(chairs);
    }
    @GetMapping(value = {"/getchair/{id}"})
    public ResponseEntity<Chair> getChair(@PathVariable int id) {
        Chair chair = chairService.getChairById(id);
        return new ResponseEntity<Chair>(chair, HttpStatus.OK);
    }
}
