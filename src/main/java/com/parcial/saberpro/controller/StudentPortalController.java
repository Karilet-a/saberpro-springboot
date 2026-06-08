package com.parcial.saberpro.controller;

import com.parcial.saberpro.model.Student;
import com.parcial.saberpro.repository.StudentRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/student")
public class StudentPortalController {
    private final StudentRepository studentRepository;

    public StudentPortalController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping
    public String portal(Model model) {
        Student student = studentRepository.findAll().stream().findFirst().orElseThrow();
        model.addAttribute("student", student);
        model.addAttribute("lastResult", student.lastResult().orElse(null));
        return "student/portal";
    }

    @PostMapping("/payment")
    public String payment(@RequestParam String paymentReference) {
        Student student = studentRepository.findAll().stream().findFirst().orElseThrow();
        student.setPaymentUploaded(true);
        student.setPaymentReference(paymentReference);
        studentRepository.save(student);
        return "redirect:/student";
    }
}
