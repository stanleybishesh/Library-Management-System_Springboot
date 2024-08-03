package com.example.lms.service;

import com.example.lms.model.Record;
import com.example.lms.repository.RecordRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RecordService {
    private final RecordRepository repo;

    public Record addRecord(Record record) {
        return repo.save(record);
    }

    public Iterable<Record> displayAllRecords() {
        return repo.findAll();
    }
}
