package com.parcial.saberpro.service;

import com.parcial.saberpro.model.ExamResult;
import com.parcial.saberpro.model.Student;
import com.parcial.saberpro.repository.ExamResultRepository;
import com.parcial.saberpro.repository.StudentRepository;
import java.util.Comparator;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ReportService {
    private final StudentRepository studentRepository;
    private final ExamResultRepository resultRepository;

    public ReportService(StudentRepository studentRepository, ExamResultRepository resultRepository) {
        this.studentRepository = studentRepository;
        this.resultRepository = resultRepository;
    }

    public List<Student> allStudents() {
        return studentRepository.findAll();
    }

    public List<ExamResult> allResultsByScore() {
        return resultRepository.findAll().stream()
                .sorted(Comparator.comparing(ExamResult::getGlobalScore, Comparator.nullsLast(Comparator.reverseOrder())))
                .toList();
    }

    public List<ExamResult> benefitResults() {
        return resultRepository.findAll().stream()
                .filter(ExamResult::qualifiesForBenefit)
                .sorted(Comparator.comparing(ExamResult::getGlobalScore, Comparator.nullsLast(Comparator.reverseOrder())))
                .toList();
    }

    public double averageGlobalScore() {
        return resultRepository.findAll().stream()
                .filter(result -> result.getGlobalScore() != null)
                .mapToInt(ExamResult::getGlobalScore)
                .average()
                .orElse(0);
    }
}
