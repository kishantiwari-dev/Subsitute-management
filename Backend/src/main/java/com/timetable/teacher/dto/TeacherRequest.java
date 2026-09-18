package com.timetable.teacher.dto;

public class TeacherRequest {

   private Long teacherId;
    private String name;
    private String department;
    private String designation;
    private String subject;
    private String employeeCode;
    private Integer weeklyWorkload;

    public TeacherRequest()
    {}

    //getters
    public  Long getTeacherId()
    {
        return teacherId;
    }
    public String getName()
    {
        return name;
    }
    public  String getDepartment()
    {
        return department;
    }
    public  String getDesignation()
    {
        return designation;
    }
    public  String getSubject()
    {
        return subject;
    }
    public  String getEmployeeCode()
    {
        return employeeCode;
    }
    public  Integer getWeeklyWorkload()
    {
        return weeklyWorkload;
    }
  public TeacherRequest(Long teacherId, String name, String department, String designation, String subject , String employeeCode , int weeklyWorkload)
    {
        this.teacherId=teacherId;
        this.name=name;
        this.department=department;
        this.designation=designation;
        this.subject=subject;
        this.employeeCode=employeeCode;
        this.weeklyWorkload=weeklyWorkload;
    }
   public void setTeacherId(Long teacherId)
   {
    this.teacherId=teacherId;
   }
   public void setName(String name)
   {
    this.name=name;
   }
   public void setDepartment(String department)
   {
    this.department=department;
   }
   public void setDesignation(String designation)
   {
    this.designation=designation;
   }
   public void setSubject(String subject)
   {
    this.subject=subject;
   }
   public void setEmployeeCode(String employeecode)
   {
    this.employeeCode=employeecode;
   }
   public void setWeeklyWorkload(Integer weeklyWorkload)
   {
    this.weeklyWorkload=weeklyWorkload;
   }
}