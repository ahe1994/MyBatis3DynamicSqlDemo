package com.example.mybatisdynamicsqldemo.service;

import com.example.mybatisdynamicsqldemo.model.ScoreDTO;
import com.example.mybatisdynamicsqldemo.model.Student;
import java.util.List;
import java.util.Optional;
import org.apache.ibatis.annotations.Param;

public interface StudentService {

  Optional<Student> selectStudentsByUsername(@Param("username") String username);

  List<Student> selectStudents();

  List<ScoreDTO> getStudentScores(String studentId);

}
