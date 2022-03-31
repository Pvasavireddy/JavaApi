package com.deloitte.spring.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deloitte.spring.boot.Entity.Car;

@Repository
public interface CarDao extends JpaRepository<Car, Long>{

}
