package com.parcial.saberpro.controller;

import com.parcial.saberpro.model.Student;
import com.parcial.saberpro.repository.FacultyRepository;
import com.parcial.saberpro.repository.StudentRepository;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/students")
public class StudentController {
    private final StudentRepository studentRepository;
    private final FacultyRepository facultyRepository;

    public StudentController(StudentRepository studentRepository, FacultyRepository facultyRepository) {
        this.studentRepository = studentRepository;
        this.facultyRepository = facultyRepository;
    }

    @GetMapping
    public String list(Model model) {
        model.addAttribute("students", studentRepository.findAll());
        return "students/list";
    }

    @GetMapping("/new")
    public String create(Model model) {
        model.addAttribute("student", new Student());
        model.addAttribute("faculties", facultyRepository.findAll());
        return "students/form";
    }

    @PostMapping
    public String save(@Valid @ModelAttribute Student student, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("faculties", facultyRepository.findAll());
            return "students/form";
        }
        if (student.getId() != null) {
            Student current = studentRepository.findById(student.getId()).orElseThrow();
            current.setDocumentType(student.getDocumentType());
            current.setDocumentNumber(student.getDocumentNumber());
            current.setFirstName(student.getFirstName());
            current.setSecondName(student.getSecondName());
            current.setFirstLastName(student.getFirstLastName());
            current.setSecondLastName(student.getSecondLastName());
            current.setEmail(student.getEmail());
            current.setPhone(student.getPhone());
            current.setFaculty(student.getFaculty());
            studentRepository.save(current);
            return "redirect:/students";
        }
        studentRepository.save(student);
        return "redirect:/students";
    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable Long id, Model model) {
        model.addAttribute("student", studentRepository.findById(id).orElseThrow());
        model.addAttribute("faculties", facultyRepository.findAll());
        return "students/form";
    }

    @PostMapping("/{id}/approve")
    public String approve(@PathVariable Long id) {
        Student student = studentRepository.findById(id).orElseThrow();
        student.setApprovedForSaberPro(true);
        studentRepository.save(student);
        return "redirect:/students";
    }
}
