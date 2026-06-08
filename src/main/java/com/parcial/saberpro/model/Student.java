package com.parcial.saberpro.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String documentType = "CC";

    @NotBlank
    private String documentNumber;

    @NotBlank
    private String firstName;

    private String secondName;

    @NotBlank
    private String firstLastName;

    private String secondLastName;

    @Email
    private String email;

    private String phone;
    private boolean approvedForSaberPro;
    private boolean paymentUploaded;
    private String paymentReference;

    @ManyToOne
    private Faculty faculty;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<ExamResult> results = new ArrayList<>();

    public Optional<ExamResult> lastResult() {
        return results.stream().max(Comparator.comparing(ExamResult::getApplicationYear));
    }

    public String fullName() {
        return String.join(" ", firstName, nullToEmpty(secondName), firstLastName, nullToEmpty(secondLastName)).trim().replaceAll("\\s+", " ");
    }

    private String nullToEmpty(String value) {
        return value == null ? "" : value;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getDocumentType() { return documentType; }
    public void setDocumentType(String documentType) { this.documentType = documentType; }
    public String getDocumentNumber() { return documentNumber; }
    public void setDocumentNumber(String documentNumber) { this.documentNumber = documentNumber; }
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getSecondName() { return secondName; }
    public void setSecondName(String secondName) { this.secondName = secondName; }
    public String getFirstLastName() { return firstLastName; }
    public void setFirstLastName(String firstLastName) { this.firstLastName = firstLastName; }
    public String getSecondLastName() { return secondLastName; }
    public void setSecondLastName(String secondLastName) { this.secondLastName = secondLastName; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
    public boolean isApprovedForSaberPro() { return approvedForSaberPro; }
    public void setApprovedForSaberPro(boolean approvedForSaberPro) { this.approvedForSaberPro = approvedForSaberPro; }
    public boolean isPaymentUploaded() { return paymentUploaded; }
    public void setPaymentUploaded(boolean paymentUploaded) { this.paymentUploaded = paymentUploaded; }
    public String getPaymentReference() { return paymentReference; }
    public void setPaymentReference(String paymentReference) { this.paymentReference = paymentReference; }
    public Faculty getFaculty() { return faculty; }
    public void setFaculty(Faculty faculty) { this.faculty = faculty; }
    public List<ExamResult> getResults() { return results; }
    public void setResults(List<ExamResult> results) { this.results = results; }
}
