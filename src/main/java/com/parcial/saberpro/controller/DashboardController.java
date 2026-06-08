package com.parcial.saberpro.controller;

import com.parcial.saberpro.repository.ExamResultRepository;
import com.parcial.saberpro.repository.StudentRepository;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {
    private final StudentRepository studentRepository;
    private final ExamResultRepository resultRepository;

    public DashboardController(StudentRepository studentRepository, ExamResultRepository resultRepository) {
        this.studentRepository = studentRepository;
        this.resultRepository = resultRepository;
    }

    @GetMapping("/")
    public String home() {
        return "redirect:/dashboard";
    }

    @GetMapping("/dashboard")
    public String dashboard(Model model, Authentication authentication) {
        model.addAttribute("username", authentication.getName());
        model.addAttribute("roles", authentication.getAuthorities());
        model.addAttribute("studentsCount", studentRepository.count());
        model.addAttribute("resultsCount", resultRepository.count());
        return "dashboard";
    }
}
