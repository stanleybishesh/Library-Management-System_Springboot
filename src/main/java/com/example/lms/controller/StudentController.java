package com.example.lms.controller;

import com.example.lms.dto.AddStudentDTO;
import com.example.lms.model.Book;
import com.example.lms.model.Student;
import com.example.lms.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@org.springframework.stereotype.Controller
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @GetMapping("/addStudent")
    public String addStudent(){
        return "HTMLpages/addStudent";
    }

    @PostMapping("/submitStudent")
    public String submitStudent(@ModelAttribute AddStudentDTO student){
        studentService.addStudent(student);
        return "redirect:/students";
    }

    @GetMapping("/students")
    public String displayAllStudents(Model model){
        Iterable<Student> student = studentService.displayAllStudents();
        model.addAttribute("students",student);
        return "HTMLpages/students";
    }

    @GetMapping("/editStudent/{id}")
    public String editStudent(@PathVariable Integer id, Model model){
        Student student1 = studentService.findById(id);
        model.addAttribute("student",student1);
        return "HTMLpages/addStudent";
    }

    @GetMapping("/deleteStudent/{id}")
    public String deleteBook(@PathVariable Integer id){
        studentService.deleteById(id);
        return "redirect:/students";
    }

}
