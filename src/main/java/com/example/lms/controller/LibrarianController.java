package com.example.lms.controller;

import com.example.lms.dto.AddLibrarianDTO;
import com.example.lms.model.Book;
import com.example.lms.model.Librarian;
import com.example.lms.service.LibrarianService;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@org.springframework.stereotype.Controller
@RequiredArgsConstructor
public class LibrarianController {
    private final LibrarianService librarianService;

    @GetMapping("/addLibrarian")
    public String addLibrarian(){
        return "HTMLpages/addLibrarian";
    }

    @PostMapping("/submitLibrarian")
    public String submitLibrarian(@ModelAttribute AddLibrarianDTO librarian){
        librarianService.addLibrarian(librarian);
        return "redirect:/librarians";
    }

    @GetMapping("/librarians")
    public String displayAllLibrarians(Model model){
        Iterable<Librarian> librarian = librarianService.displayAllLibrarians();
        model.addAttribute("librarians",librarian);
        return "HTMLpages/librarians";
    }

    @GetMapping("/editLibrarian/{id}")
    public String editLibrarian(@PathVariable Integer id, Model model){
        Librarian librarian1 = librarianService.findById(id);
        model.addAttribute("librarian",librarian1);
        return "HTMLpages/addLibrarian";
    }

    @GetMapping("/deleteLibrarian/{id}")
    public String deleteLibrarian(@PathVariable Integer id){
        librarianService.deleteById(id);
        return "redirect:/librarians";
    }
}
