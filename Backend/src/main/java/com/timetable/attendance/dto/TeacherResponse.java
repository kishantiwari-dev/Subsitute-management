package com.timetable.attendance.dto;

public class TeacherResponse {

    private Long teacherId;
    private String name;
    private String department;
    private String designation;
    private String status;
    
    public TeacherResponse()
    {}

    public TeacherResponse(Long teacherId, String name, String department, String designation, String status)
    {
        this.teacherId=teacherId;
        this.name=name;
        this.department=department;
        this.designation=designation;
        this.status=status;
    }

    public Long getTeacherId()
    {
        return teacherId;
    }
    public void setTeacherId(Long teacherId)
    {
        this.teacherId=teacherId;
    }

      public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public String getDesignation() { return designation; }
    public void setDesignation(String designation) { this.designation = designation; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}