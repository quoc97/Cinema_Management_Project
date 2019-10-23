package com.codegym.service;
import com.codegym.dao.entity.ShowTime;
import java.util.List;
public interface ShowTimeService {
    List<ShowTime> getShowTimes();
    ShowTime getById(int id);
}
