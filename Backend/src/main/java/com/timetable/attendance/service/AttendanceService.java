package com.timetable.attendance.service;

import com.timetable.attendance.dto.AttendanceSyncRequest;
import com.timetable.teacher.dto.TeacherResponse;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AttendanceService {

    private final List<TeacherResponse> absentTeachers = new ArrayList<>();

    public String syncAttendance(AttendanceSyncRequest request) {

        if ("ABSENT".equalsIgnoreCase(request.getStatus())) {

            TeacherResponse teacher = new TeacherResponse(
                    request.getTeacherId(),
                    "Teacher " + request.getTeacherId(),
                    "CSE",
                    "Assistant Professor",
                    request.getStatus()
            );

            absentTeachers.add(teacher);

            return teacher.getName() + " marked absent.";
        }

        return "Teacher " + request.getTeacherId() + " is present.";
    }

    public List<TeacherResponse> getAbsentTeachers() {
        return absentTeachers;
    }
}