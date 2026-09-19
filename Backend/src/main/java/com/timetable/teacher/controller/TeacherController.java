package com.timetable.teacher.controller;

import com.timetable.teacher.dto.TeacherRequest;
import com.timetable.teacher.dto.TeacherResponse;
import com.timetable.teacher.service.TeacherService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/teachers")
@CrossOrigin(origins = "http://127.0.0.1:3000")
public class TeacherController {

    private final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @PostMapping
    public TeacherResponse addTeacher(@RequestBody TeacherRequest request) {
        return teacherService.addTeacher(request);
    }

    @GetMapping
    public List<TeacherResponse> getAllTeachers() {
        return teacherService.getAllTeachers();
    }
}