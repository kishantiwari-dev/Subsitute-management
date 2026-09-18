package com.timetable.teacher.service;

import com.timetable.teacher.dto.TeacherRequest;
import com.timetable.teacher.dto.TeacherResponse;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeacherService {

    private final List<TeacherResponse> teachers = new ArrayList<>();

    public TeacherResponse addTeacher(TeacherRequest request) {

        TeacherResponse teacher = new TeacherResponse();

        teacher.setTeacherId(request.getTeacherId());
        teacher.setName(request.getName());
        teacher.setDepartment(request.getDepartment());
        teacher.setDesignation(request.getDesignation());
        teacher.setSubject(request.getSubject());
        teacher.setWeeklyWorkload(request.getWeeklyWorkload());

        teachers.add(teacher);

        return teacher;
    }

    public List<TeacherResponse> getAllTeachers() {
        return teachers;
    }
}