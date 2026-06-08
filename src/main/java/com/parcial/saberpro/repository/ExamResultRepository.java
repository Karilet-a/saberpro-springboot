package com.parcial.saberpro.repository;

import com.parcial.saberpro.model.ExamResult;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExamResultRepository extends JpaRepository<ExamResult, Long> {
    List<ExamResult> findByStudentDocumentNumberOrderByApplicationYearDesc(String documentNumber);
}
