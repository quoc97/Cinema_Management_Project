package com.codegym.service.impl;
import com.codegym.dao.entity.Chair;
import com.codegym.dao.repository.ChairRepository;
import com.codegym.service.ChairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
class ChairServiceImpl implements ChairService {
    @Autowired
    private ChairRepository chairRepository;
    @Override
    public List<Chair> getChairs() {
        return chairRepository.findAll();
    }
    @Override
    public Chair getChairById(int id) {
        return chairRepository.findById(id).orElse(null);
    }
}