package com.codegym.dao.repository;
import com.codegym.dao.entity.ShowTime;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ShowTimeRepository extends JpaRepository<ShowTime,Integer> {
}