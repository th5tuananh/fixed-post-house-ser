package com.lhq.fileservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lhq.fileservice.model.DBFile;

@Repository
public interface DBFileRepository extends JpaRepository<DBFile, String> {

}