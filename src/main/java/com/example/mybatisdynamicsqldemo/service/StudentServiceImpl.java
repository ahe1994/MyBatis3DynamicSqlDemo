// ==========================
// Copyright (c) 2021-09-16, Hyva Holding B.V.
// All rights reserved.
// ==========================
package com.example.mybatisdynamicsqldemo.service;

import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;
import static org.mybatis.dynamic.sql.SqlBuilder.select;
import static com.example.mybatisdynamicsqldemo.mapper.StudentDynamicSqlSupport.*;

import com.example.mybatisdynamicsqldemo.mapper.CourseDynamicSqlSupport;
import com.example.mybatisdynamicsqldemo.mapper.CustomMapper;
import com.example.mybatisdynamicsqldemo.mapper.ScoreDynamicSqlSupport;
import com.example.mybatisdynamicsqldemo.mapper.StudentDynamicSqlSupport;
import com.example.mybatisdynamicsqldemo.mapper.StudentMapper;
import com.example.mybatisdynamicsqldemo.model.ScoreDTO;
import com.example.mybatisdynamicsqldemo.model.Student;
import java.util.List;
import java.util.Optional;
import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.render.MyBatis3RenderingStrategy;
import org.mybatis.dynamic.sql.render.RenderingStrategy;
import org.mybatis.dynamic.sql.select.join.EqualTo;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

  private final StudentMapper studentMapper;

  private final CustomMapper customMapper;

  @Autowired
  public StudentServiceImpl(StudentMapper studentMapper, CustomMapper customMapper) {
    this.studentMapper = studentMapper;
    this.customMapper = customMapper;
  }

  @Override
  public Optional<Student> selectStudentsByUsername(String username) {
    RenderingStrategy renderingStrategy = new MyBatis3RenderingStrategy();
    SelectStatementProvider selectStatementProvider = select(
        StudentDynamicSqlSupport.id,
        StudentDynamicSqlSupport.username,
        StudentDynamicSqlSupport.gender,
        StudentDynamicSqlSupport.age)
        .from(student)
        .where(StudentDynamicSqlSupport.username, isEqualTo(username))
        .build()
        .render(renderingStrategy);

    Optional<Student> student = studentMapper.selectOne(selectStatementProvider);
    return student;
  }

  @Override
  public List<Student> selectStudents() {
    RenderingStrategy renderingStrategy = new MyBatis3RenderingStrategy();
    SelectStatementProvider selectStatementProvider = select(
        StudentDynamicSqlSupport.id,
        StudentDynamicSqlSupport.username,
        StudentDynamicSqlSupport.gender,
        StudentDynamicSqlSupport.age)
        .from(student)
        .where(username, isEqualTo("zhangsan"))
        .build()
        .render(renderingStrategy);

    List<Student> students = studentMapper.selectMany(selectStatementProvider);
    return students;
  }

  @Override
  public List<ScoreDTO> getStudentScores(String studentId) {
    SelectStatementProvider ssp = SqlBuilder.select(
        ScoreDynamicSqlSupport.id.as("id"),
        CourseDynamicSqlSupport.id.as("courseId"),
        CourseDynamicSqlSupport.name.as("courseName"),
        id.as("studentId"),
        username.as("studentName"),
        ScoreDynamicSqlSupport.studentscore.as("studentScore"))
        .from(student)
        .fullJoin(ScoreDynamicSqlSupport.score)
        .on(id, new EqualTo(ScoreDynamicSqlSupport.studentid))
        .fullJoin(CourseDynamicSqlSupport.course)
        .on(ScoreDynamicSqlSupport.courseid, new EqualTo(CourseDynamicSqlSupport.id))
        .where(id, isEqualTo(studentId))
        .build()
        .render(new MyBatis3RenderingStrategy());
    return customMapper.getStudentScores(ssp);
  }
}
