package com.parcial.saberpro.controller;

import com.parcial.saberpro.model.Faculty;
import com.parcial.saberpro.model.Teacher;
import com.parcial.saberpro.repository.FacultyRepository;
import com.parcial.saberpro.repository.TeacherRepository;
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
@RequestMapping("/admin/catalogs")
public class AdminCatalogController {
    private final FacultyRepository facultyRepository;
    private final TeacherRepository teacherRepository;

    public AdminCatalogController(FacultyRepository facultyRepository, TeacherRepository teacherRepository) {
        this.facultyRepository = facultyRepository;
        this.teacherRepository = teacherRepository;
    }

    @GetMapping
    public String catalogs(Model model) {
        model.addAttribute("faculties", facultyRepository.findAll());
        model.addAttribute("teachers", teacherRepository.findAll());
        model.addAttribute("faculty", new Faculty());
        model.addAttribute("teacher", new Teacher());
        return "admin/catalogs";
    }

    @PostMapping("/faculties")
    public String saveFaculty(@Valid @ModelAttribute Faculty faculty, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("faculties", facultyRepository.findAll());
            model.addAttribute("teachers", teacherRepository.findAll());
            model.addAttribute("teacher", new Teacher());
            return "admin/catalogs";
        }
        facultyRepository.save(faculty);
        return "redirect:/admin/catalogs";
    }

    @GetMapping("/faculties/{id}/edit")
    public String editFaculty(@PathVariable Long id, Model model) {
        model.addAttribute("faculties", facultyRepository.findAll());
        model.addAttribute("teachers", teacherRepository.findAll());
        model.addAttribute("faculty", facultyRepository.findById(id).orElseThrow());
        model.addAttribute("teacher", new Teacher());
        return "admin/catalogs";
    }

    @PostMapping("/faculties/{id}/delete")
    public String deleteFaculty(@PathVariable Long id) {
        facultyRepository.deleteById(id);
        return "redirect:/admin/catalogs";
    }

    @PostMapping("/teachers")
    public String saveTeacher(@Valid @ModelAttribute Teacher teacher, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("faculties", facultyRepository.findAll());
            model.addAttribute("teachers", teacherRepository.findAll());
            model.addAttribute("faculty", new Faculty());
            return "admin/catalogs";
        }
        teacherRepository.save(teacher);
        return "redirect:/admin/catalogs";
    }

    @GetMapping("/teachers/{id}/edit")
    public String editTeacher(@PathVariable Long id, Model model) {
        model.addAttribute("faculties", facultyRepository.findAll());
        model.addAttribute("teachers", teacherRepository.findAll());
        model.addAttribute("faculty", new Faculty());
        model.addAttribute("teacher", teacherRepository.findById(id).orElseThrow());
        return "admin/catalogs";
    }

    @PostMapping("/teachers/{id}/delete")
    public String deleteTeacher(@PathVariable Long id) {
        teacherRepository.deleteById(id);
        return "redirect:/admin/catalogs";
    }
}
