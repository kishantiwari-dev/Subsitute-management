package com.timetable.teacher.dto;

public class TeacherResponse {

    private Long teacherId;
    private String name;
    private String department;
    private String designation;
    private String status;
    private String subject;
    private Integer weeklyWorkload;

    // Default Constructor
    public TeacherResponse() {
    }

    // Parameterized Constructor
    public TeacherResponse(
            Long teacherId,
            String name,
            String department,
            String designation,
            String status,
            String subject,
            Integer weeklyWorkload) {

        this.teacherId = teacherId;
        this.name = name;
        this.department = department;
        this.designation = designation;
        this.status = status;
        this.subject = subject;
        this.weeklyWorkload = weeklyWorkload;
    }

    // Getters
    public Long getTeacherId() {
        return teacherId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getDesignation() {
        return designation;
    }

    public String getStatus() {
        return status;
    }

    public String getSubject() {
        return subject;
    }

    public Integer getWeeklyWorkload() {
        return weeklyWorkload;
    }

    // Setters
    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setWeeklyWorkload(Integer weeklyWorkload) {
        this.weeklyWorkload = weeklyWorkload;
    }
} 