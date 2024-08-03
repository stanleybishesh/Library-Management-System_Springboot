package com.example.lms.mapper;

import com.example.lms.dto.AddLibrarianDTO;
import com.example.lms.model.Librarian;
import com.example.lms.service.FileService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class LibrarianMapper {
    private final FileService fileService;

    public Librarian makeLibrarian(AddLibrarianDTO dto){
        return new Librarian().toBuilder()
                .name(dto.getName())
                .address(dto.getAddress())
                .contact(dto.getContact())
                .librarianURL(fileService.saveFile(dto.getLibrarianURL()))
        .build();
    }
}
