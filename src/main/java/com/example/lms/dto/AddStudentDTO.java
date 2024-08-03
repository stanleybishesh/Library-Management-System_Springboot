package com.example.lms.dto;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

@Data
@Builder(toBuilder = true)
public class AddStudentDTO {
    private String name;
    private String address;
    private String contact;
    private MultipartFile studentURL;
}
