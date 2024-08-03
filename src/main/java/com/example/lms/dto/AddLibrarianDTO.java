package com.example.lms.dto;

import lombok.Builder;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Builder(toBuilder = true)
@Data
public class AddLibrarianDTO {
    private String name;
    private String address;
    private String contact;
    private MultipartFile librarianURL;
}
