package com.example.lms.mapper;

import com.example.lms.dto.AddStudentDTO;
import com.example.lms.model.Student;
import com.example.lms.service.FileService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class StudentMapper {
    private final FileService fileService;

    public Student makeStudent(AddStudentDTO dto){
        return new Student().toBuilder()
                .name(dto.getName())
                .address(dto.getAddress())
                .contact(dto.getContact())
                .studentURL(fileService.saveFile(dto.getStudentURL()))
                .build();
    }
}
