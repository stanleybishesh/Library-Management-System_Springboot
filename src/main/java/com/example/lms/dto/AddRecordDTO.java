package com.example.lms.dto;

import lombok.Builder;
import lombok.Data;

@Data
public class AddRecordDTO {
    private Integer bookId;
    private Integer librarianId;
    private Integer studentId;
}
