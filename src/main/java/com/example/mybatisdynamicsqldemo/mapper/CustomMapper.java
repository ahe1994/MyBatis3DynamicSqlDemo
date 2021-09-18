package com.example.mybatisdynamicsqldemo.mapper;

import com.example.mybatisdynamicsqldemo.model.ScoreDTO;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;

@Mapper
public interface CustomMapper {

  @SelectProvider(type = SqlProviderAdapter.class, method = "select")
  @Results(id = "StudentScores", value = {
      @Result(column = "id", property = "id", jdbcType = JdbcType.VARCHAR,id = true),
      @Result(column = "courseId", property = "courseId", jdbcType = JdbcType.VARCHAR),
      @Result(column = "courseName", property = "courseName", jdbcType = JdbcType.VARCHAR),
      @Result(column = "studentId", property = "studentId", jdbcType = JdbcType.VARCHAR),
      @Result(column = "studentName", property = "studentName", jdbcType = JdbcType.VARCHAR),
      @Result(column = "studentScore", property = "studentScore", jdbcType = JdbcType.INTEGER)
  })
  List<ScoreDTO> getStudentScores(SelectStatementProvider selectStatementProvider);

}
