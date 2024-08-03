package com.example.lms.service;

import com.example.lms.dto.AddLibrarianDTO;
import com.example.lms.mapper.LibrarianMapper;
import com.example.lms.model.Librarian;
import com.example.lms.repository.LibrarianRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LibrarianService {
    private final LibrarianRepository repo;
    private final LibrarianMapper librarianMapper;

    public Librarian addLibrarian(Librarian librarian) {
        return repo.save(librarian);
    }

    public Iterable<Librarian> displayAllLibrarians() {
        return repo.findAll();
    }
    public Librarian addLibrarian(AddLibrarianDTO librarian){
        return repo.save(librarianMapper.makeLibrarian(librarian));
    }

    public Librarian findById(Integer id) {
        return repo.findById(id).get();
    }

    public void deleteById(Integer id){
        repo.deleteById(id);
    }
}

