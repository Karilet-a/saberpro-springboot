package com.parcial.saberpro.controller;

import com.parcial.saberpro.repository.ExamResultRepository;
import com.parcial.saberpro.repository.FacultyRepository;
import com.parcial.saberpro.repository.StudentRepository;
import com.parcial.saberpro.service.ReportService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/reports")
public class ReportController {
    private final ReportService reportService;
    private final StudentRepository studentRepository;
    private final ExamResultRepository resultRepository;
    private final FacultyRepository facultyRepository;

    public ReportController(ReportService reportService, StudentRepository studentRepository,
                            ExamResultRepository resultRepository, FacultyRepository facultyRepository) {
        this.reportService = reportService;
        this.studentRepository = studentRepository;
        this.resultRepository = resultRepository;
        this.facultyRepository = facultyRepository;
    }

    @GetMapping
    public String general(Model model) {
        model.addAttribute("students", reportService.allStudents());
        model.addAttribute("results", reportService.allResultsByScore());
        model.addAttribute("average", reportService.averageGlobalScore());
        return "reports/general";
    }

    @GetMapping("/detail")
    public String detail(@RequestParam(required = false) String document, Model model) {
        model.addAttribute("document", document);
        model.addAttribute("student", document == null || document.isBlank()
                ? null
                : studentRepository.findByDocumentNumber(document).orElse(null));
        return "reports/detail";
    }

    @GetMapping("/benefits")
    public String benefits(Model model) {
        model.addAttribute("results", reportService.benefitResults());
        return "reports/benefits";
    }

    @GetMapping("/faculty")
    public String byFaculty(@RequestParam(required = false) Long facultyId, Model model) {
        model.addAttribute("faculties", facultyRepository.findAll());
        model.addAttribute("facultyId", facultyId);
        model.addAttribute("students", facultyId == null
                ? studentRepository.findAll()
                : facultyRepository.findById(facultyId).map(studentRepository::findByFaculty).orElseGet(java.util.List::of));
        return "reports/faculty";
    }

    @GetMapping("/results")
    public String results(@RequestParam(required = false) String document, Model model) {
        model.addAttribute("document", document);
        model.addAttribute("results", document == null || document.isBlank()
                ? resultRepository.findAll()
                : resultRepository.findByStudentDocumentNumberOrderByApplicationYearDesc(document));
        return "reports/results";
    }
}
