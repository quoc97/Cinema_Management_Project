package com.codegym.service;


import com.codegym.dao.entity.Chair;
import java.util.List;
public interface ChairService {
    List<Chair> getChairs();
    Chair getChairById(int id);
}