package com.example.lms.mapper;

import com.example.lms.dto.AddBookDTO;
import com.example.lms.model.Book;
import com.example.lms.service.FileService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class BookMapper {
    private final FileService fileService;

    public Book makeBook(AddBookDTO dto){
        return new Book().toBuilder()
                .code(dto.getCode())
                .name(dto.getName())
                .author(dto.getAuthor())
                .cover(fileService.saveFile(dto.getCover()))
        .build();
    }

//    public AddBookDTO makeBookDTO(Book book){
//        return new AddBookDTO().toBuilder()
//                .name(book.getName())
//                .author(book.getAuthor())
//                .cover(book.getCover())
//        .build();
//    }
}
