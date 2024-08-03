package com.example.lms.controller;

import com.example.lms.dto.AddBookDTO;
import com.example.lms.model.Book;
import com.example.lms.model.Librarian;
//import com.example.lms.model.Record;
import com.example.lms.model.Student;
import com.example.lms.service.BookService;
import com.example.lms.service.LibrarianService;
//import com.example.lms.service.RecordService;
import com.example.lms.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@org.springframework.web.bind.annotation.RestController
@RequiredArgsConstructor
public class RestController {
    private final StudentService studentService;
    private final LibrarianService librarianService;
    private final BookService bookService;
//    private final RecordService recordService;

    @PostMapping("/addStudent")
    private Student addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

    @PostMapping("/addLibrarian")
    private Librarian addLibrarian(@RequestBody Librarian librarian){
        return librarianService.addLibrarian(librarian);
    }

    @PostMapping("/addBook")
    private ResponseEntity<?> addBook(@RequestBody AddBookDTO book){
//        return bookService.addBook(book);
        return new ResponseEntity<>(bookService.addBook(book),new HttpHeaders(), HttpStatus.CREATED);
    }

//    @PostMapping("/addRecord")
//    private Record addRecord(@RequestBody Record record){
//        return recordService.addRecord(record);
//    }

    @GetMapping("/displayAllStudents")
    private Iterable<Student> displayAllStudents(){
        return studentService.displayAllStudents();
    }

    @GetMapping("/displayAllLibrarians")
    private Iterable<Librarian> displayAllLibrarians(){
        return librarianService.displayAllLibrarians();
    }

    @GetMapping("/displayAllBooks")
    private Iterable<Book> displayAllBooks(){
        return bookService.displayAllBooks();
    }

//    @GetMapping("/displayAllStudents")
//    private Iterable<java.lang.Record> displayAllRecords(){
//        return recordService.displayAllRecords();
//    }
}
