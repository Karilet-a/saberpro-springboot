package com.parcial.saberpro.repository;

import com.parcial.saberpro.model.Faculty;
import com.parcial.saberpro.model.Student;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
    Optional<Student> findByDocumentNumber(String documentNumber);
    List<Student> findByFaculty(Faculty faculty);
}
