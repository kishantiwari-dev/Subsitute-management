package com.timetable.attendance.controller;

import com.timetable.attendance.dto.AttendanceSyncRequest;
import com.timetable.attendance.dto.TeacherResponse;
import com.timetable.attendance.service.AttendanceService;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/attendance")
@CrossOrigin(origins = "http://127.0.0.1:3000")
public class AttendanceController {

    private final AttendanceService attendanceService;

    public AttendanceController(AttendanceService attendanceService) {
        this.attendanceService = attendanceService;
    }

    @PostMapping("/sync")
    public String syncAttendance(@RequestBody AttendanceSyncRequest request) {
        return attendanceService.syncAttendance(request);
    }

    @GetMapping("/absent")
    public List<TeacherResponse> getAbsentTeachers() {
        return attendanceService.getAbsentTeachers();
    }
}