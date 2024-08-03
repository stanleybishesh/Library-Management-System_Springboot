package com.example.lms.mapper;

import com.example.lms.dto.AddLibrarianDTO;
import com.example.lms.dto.AddRecordDTO;
import com.example.lms.model.Librarian;
import com.example.lms.model.Record;
import com.example.lms.service.FileService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class RecordMapper {
//    private final FileService fileService;

    public Record makeRecord(AddRecordDTO dto){
        return new Record().toBuilder()
                .id(dto.getBookId())
                .id(dto.getLibrarianId())
                .id(dto.getStudentId())
                .build();
    }
}
