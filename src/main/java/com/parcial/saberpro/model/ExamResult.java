package com.parcial.saberpro.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class ExamResult {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int applicationYear;
    private String registryNumber;
    private Integer globalScore;
    private String globalLevel;
    private Integer writtenCommunication;
    private String writtenCommunicationLevel;
    private Integer quantitativeReasoning;
    private String quantitativeReasoningLevel;
    private Integer criticalReading;
    private String criticalReadingLevel;
    private Integer citizenCompetencies;
    private String citizenCompetenciesLevel;
    private Integer english;
    private String englishLevel;
    private Integer engineeringProjects;
    private String engineeringProjectsLevel;
    private Integer mathStatistics;
    private String mathStatisticsLevel;
    private Integer softwareDesign;
    private String softwareDesignLevel;
    private String englishCategory;

    @ManyToOne
    private Student student;

    public boolean qualifiesForBenefit() {
        return globalScore != null && globalScore >= 160
                || "Nivel 4".equalsIgnoreCase(globalLevel)
                || "B2".equalsIgnoreCase(englishCategory);
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public int getApplicationYear() { return applicationYear; }
    public void setApplicationYear(int applicationYear) { this.applicationYear = applicationYear; }
    public String getRegistryNumber() { return registryNumber; }
    public void setRegistryNumber(String registryNumber) { this.registryNumber = registryNumber; }
    public Integer getGlobalScore() { return globalScore; }
    public void setGlobalScore(Integer globalScore) { this.globalScore = globalScore; }
    public String getGlobalLevel() { return globalLevel; }
    public void setGlobalLevel(String globalLevel) { this.globalLevel = globalLevel; }
    public Integer getWrittenCommunication() { return writtenCommunication; }
    public void setWrittenCommunication(Integer writtenCommunication) { this.writtenCommunication = writtenCommunication; }
    public String getWrittenCommunicationLevel() { return writtenCommunicationLevel; }
    public void setWrittenCommunicationLevel(String writtenCommunicationLevel) { this.writtenCommunicationLevel = writtenCommunicationLevel; }
    public Integer getQuantitativeReasoning() { return quantitativeReasoning; }
    public void setQuantitativeReasoning(Integer quantitativeReasoning) { this.quantitativeReasoning = quantitativeReasoning; }
    public String getQuantitativeReasoningLevel() { return quantitativeReasoningLevel; }
    public void setQuantitativeReasoningLevel(String quantitativeReasoningLevel) { this.quantitativeReasoningLevel = quantitativeReasoningLevel; }
    public Integer getCriticalReading() { return criticalReading; }
    public void setCriticalReading(Integer criticalReading) { this.criticalReading = criticalReading; }
    public String getCriticalReadingLevel() { return criticalReadingLevel; }
    public void setCriticalReadingLevel(String criticalReadingLevel) { this.criticalReadingLevel = criticalReadingLevel; }
    public Integer getCitizenCompetencies() { return citizenCompetencies; }
    public void setCitizenCompetencies(Integer citizenCompetencies) { this.citizenCompetencies = citizenCompetencies; }
    public String getCitizenCompetenciesLevel() { return citizenCompetenciesLevel; }
    public void setCitizenCompetenciesLevel(String citizenCompetenciesLevel) { this.citizenCompetenciesLevel = citizenCompetenciesLevel; }
    public Integer getEnglish() { return english; }
    public void setEnglish(Integer english) { this.english = english; }
    public String getEnglishLevel() { return englishLevel; }
    public void setEnglishLevel(String englishLevel) { this.englishLevel = englishLevel; }
    public Integer getEngineeringProjects() { return engineeringProjects; }
    public void setEngineeringProjects(Integer engineeringProjects) { this.engineeringProjects = engineeringProjects; }
    public String getEngineeringProjectsLevel() { return engineeringProjectsLevel; }
    public void setEngineeringProjectsLevel(String engineeringProjectsLevel) { this.engineeringProjectsLevel = engineeringProjectsLevel; }
    public Integer getMathStatistics() { return mathStatistics; }
    public void setMathStatistics(Integer mathStatistics) { this.mathStatistics = mathStatistics; }
    public String getMathStatisticsLevel() { return mathStatisticsLevel; }
    public void setMathStatisticsLevel(String mathStatisticsLevel) { this.mathStatisticsLevel = mathStatisticsLevel; }
    public Integer getSoftwareDesign() { return softwareDesign; }
    public void setSoftwareDesign(Integer softwareDesign) { this.softwareDesign = softwareDesign; }
    public String getSoftwareDesignLevel() { return softwareDesignLevel; }
    public void setSoftwareDesignLevel(String softwareDesignLevel) { this.softwareDesignLevel = softwareDesignLevel; }
    public String getEnglishCategory() { return englishCategory; }
    public void setEnglishCategory(String englishCategory) { this.englishCategory = englishCategory; }
    public Student getStudent() { return student; }
    public void setStudent(Student student) { this.student = student; }
}
