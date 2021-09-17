package com.example.mybatisdynamicsqldemo.mapper;

import static com.example.mybatisdynamicsqldemo.mapper.ScoreDynamicSqlSupport.*;

import com.example.mybatisdynamicsqldemo.model.Score;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.insert.render.MultiRowInsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface ScoreMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, courseid, studentid, studentscore);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Score> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<Score> multipleInsertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ScoreResult")
    Optional<Score> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ScoreResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR),
        @Result(column="courseid", property="courseid", jdbcType=JdbcType.VARCHAR),
        @Result(column="studentid", property="studentid", jdbcType=JdbcType.VARCHAR),
        @Result(column="studentscore", property="studentscore", jdbcType=JdbcType.INTEGER)
    })
    List<Score> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, score, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, score, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Score record) {
        return MyBatis3Utils.insert(this::insert, record, score, c ->
            c.map(id).toProperty("id")
            .map(courseid).toProperty("courseid")
            .map(studentid).toProperty("studentid")
            .map(studentscore).toProperty("studentscore")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<Score> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, score, c ->
            c.map(id).toProperty("id")
            .map(courseid).toProperty("courseid")
            .map(studentid).toProperty("studentid")
            .map(studentscore).toProperty("studentscore")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(Score record) {
        return MyBatis3Utils.insert(this::insert, record, score, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(courseid).toPropertyWhenPresent("courseid", record::getCourseid)
            .map(studentid).toPropertyWhenPresent("studentid", record::getStudentid)
            .map(studentscore).toPropertyWhenPresent("studentscore", record::getStudentscore)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Score> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, score, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Score> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, score, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Score> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, score, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, score, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(Score record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(courseid).equalTo(record::getCourseid)
                .set(studentid).equalTo(record::getStudentid)
                .set(studentscore).equalTo(record::getStudentscore);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Score record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(courseid).equalToWhenPresent(record::getCourseid)
                .set(studentid).equalToWhenPresent(record::getStudentid)
                .set(studentscore).equalToWhenPresent(record::getStudentscore);
    }
}