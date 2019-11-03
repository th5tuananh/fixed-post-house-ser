package com.lhq.houseservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lhq.houseservice.model.House;

@Repository
public interface HouseRepository extends JpaRepository<House, Long> {

}
