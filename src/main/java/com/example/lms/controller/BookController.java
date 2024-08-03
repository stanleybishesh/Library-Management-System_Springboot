package com.example.lms.controller;

import com.example.lms.dto.AddBookDTO;
import com.example.lms.model.Book;
import com.example.lms.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@org.springframework.stereotype.Controller
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;

    @GetMapping("/addBook")
    public String addBook(){
        return "HTMLpages/books";
    }

    @PostMapping("/submitBook")
    public String submitBook(@ModelAttribute AddBookDTO book,Model model){
        Book b1 = bookService.findByCode(book.getCode());
        Book b2 = bookService.findByCodeOrName(book.getCode(),book.getName());
        Book b3 = bookService.findByCodeAndName(book.getCode(),book.getName());
        if(b1==null){
            bookService.addBook(book);
            return "redirect:/books";
        }
//        else if(b2==null){
//            bookService.addBook(book);
//            return "redirect:/displayBooks";
//        }else if(b3==null){
//            bookService.addBook(book);
//            return "redirect:/displayBooks";
//        }
        else{
            model.addAttribute("errorMessage", "Book with the given code already exists.");
            return "HTMLpages/books";
        }
    }

    @GetMapping("/editBook/{id}")
    public String editBook(@PathVariable Integer id,Model model){
        Book book1 = bookService.findById(id);
        model.addAttribute("book",book1);
        return "HTMLpages/books";
        /* "redirect:/addBook (WRONG!!)) because redirect tries
        to find another get mapping and override our logic.*/
    }

    @GetMapping("/deleteBook/{id}")
    public String deleteBook(@PathVariable Integer id){
        bookService.deleteById(id);
        return "redirect:/books";
    }

    @GetMapping("/books")
    public String displayAllBooks(Model model){
        Iterable<Book> book = bookService.displayAllBooks();
        model.addAttribute("books",book);
        return "HTMLpages/books";
    }
}
