package com.example.lms.repository;

import com.example.lms.model.Record;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface RecordRepository extends JpaRepository<Record,Integer> {
}
