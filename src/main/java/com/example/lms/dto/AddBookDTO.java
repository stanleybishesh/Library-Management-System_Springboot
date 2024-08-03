package com.example.lms.dto;

import lombok.Builder;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
@Builder(toBuilder = true)
public class AddBookDTO {
    private String code;
    private String name;
    private String author;
    private MultipartFile cover;
}
