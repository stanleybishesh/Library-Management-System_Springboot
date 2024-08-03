package com.example.lms.service;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;


@Service
public class FileService {
    @Value("${file.upload-dir}")
    private String uploadDir;
    public String saveFile(MultipartFile file){
        try {
            // Get the file name and create the file path
            String fileName = StringUtils.cleanPath(file.getOriginalFilename());
            Path filePath = Paths.get(uploadDir + File.separator + fileName);
            // Save the file to the server
            Files.copy(file.getInputStream(), filePath, StandardCopyOption.REPLACE_EXISTING);
            return filePath.toString();
        } catch (IOException e) {
            throw new RuntimeException("Could not store file: " + e.getMessage());}
    }
}
