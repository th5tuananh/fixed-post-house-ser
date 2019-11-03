package com.lhq.houseservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lhq.houseservice.model.HouseCata;

@Repository
public interface HouseCataRepository extends JpaRepository<HouseCata, Long>{

}