package com.timetable.attendance.dto;

public class AttendanceSyncRequest {

    private Long teacherId;
    private  String status;
    
    public AttendanceSyncRequest()
    {}
    public Long getTeacherId()
    {
        return teacherId;
    }
    public void setTeacherId(Long teacherId)
    {
        this.teacherId=teacherId;
    }

    public String getStatus()
    {
        return status;
    }
    public void setStatus(String status)
    {
        this.status=status;
    }
}