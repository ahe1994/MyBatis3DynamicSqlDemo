// ==========================
// Copyright (c) 2021-09-16, Hyva Holding B.V.
// All rights reserved.
// ==========================
package com.example.mybatisdynamicsqldemo.controller;

import com.example.mybatisdynamicsqldemo.model.ScoreDTO;
import com.example.mybatisdynamicsqldemo.model.Student;
import com.example.mybatisdynamicsqldemo.service.StudentService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

  private StudentService studentService;

  @Autowired
  public StudentController(StudentService studentService) {
    this.studentService = studentService;
  }

  @GetMapping("/students/{username}")
  public Optional<Student> getStudent(@PathVariable("username") String username) {
    return studentService.selectStudentsByUsername(username);
  }

  @GetMapping("/students")
  public List<Student> getStudents() {
    return studentService.selectStudents();
  }

  @GetMapping("/scores/{studentId}")
  public List<ScoreDTO> getStudentScore(@PathVariable("studentId") String studentId){
    return studentService.getStudentScores(studentId);
  }

}
