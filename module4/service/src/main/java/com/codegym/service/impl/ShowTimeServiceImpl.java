package com.codegym.service.impl;
import com.codegym.dao.entity.ShowTime;
import com.codegym.dao.repository.ShowTimeRepository;
import com.codegym.service.ShowTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ShowTimeServiceImpl implements ShowTimeService {
    @Autowired
    private ShowTimeRepository showTimeRepository;
    @Override
    public List<ShowTime> getShowTimes() {
        return showTimeRepository.findAll();
    }
    @Override
    public ShowTime getById(int id) {
        return showTimeRepository.findById(id).orElse(null);
    }
}