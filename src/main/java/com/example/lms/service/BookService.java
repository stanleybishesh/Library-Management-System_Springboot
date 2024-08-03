package com.example.lms.service;

import com.example.lms.dto.AddBookDTO;
import com.example.lms.mapper.BookMapper;
import com.example.lms.model.Book;
import com.example.lms.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository repo;
    private final BookMapper bookMapper;

    public Book addBook(AddBookDTO book) {
        return repo.save(bookMapper.makeBook(book));
    }

    public Iterable<Book> displayAllBooks() {
        return repo.findAll();
//        Iterable<Book> books = new ArrayList<>();
//        for (Book book:repo.findAll()){
//            book.setCover(book.getCover().replace("\\","/"));
//        }
    }

    public Book findById(Integer id) {
            return repo.findById(id).get();
    }

    public Book findByCode(String code) {
            return repo.findByCode(code);
    }

    public Book findByCodeAndName(String code,String name) {
            return repo.findByCodeAndName(code,name);
    }

    public Book findByCodeOrName(String code,String name) {
            return repo.findByCodeOrName(code,name);
    }

    public void deleteById(Integer id) {
        repo.deleteById(id);
    }
}
