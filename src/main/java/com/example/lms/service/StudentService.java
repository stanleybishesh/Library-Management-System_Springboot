package com.example.lms.service;

import com.example.lms.dto.AddStudentDTO;
import com.example.lms.mapper.StudentMapper;
import com.example.lms.model.Student;
import com.example.lms.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository repo;
    private final StudentMapper studentMapper;

    public Student addStudent(Student student) {
        return repo.save(student);
    }

    public Iterable<Student> displayAllStudents() {
        return repo.findAll();
    }

    public Student addStudent(AddStudentDTO student){
        return repo.save(studentMapper.makeStudent(student));
    }

    public Student findById(Integer id) {
        return repo.findById(id).get();
    }
    public void deleteById(Integer id){
        repo.deleteById(id);
    }
}
