package com.example.mybatisdynamicsqldemo.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ScoreDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Score score = new Score();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> id = score.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> courseid = score.courseid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> studentid = score.studentid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> studentscore = score.studentscore;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Score extends SqlTable {
        public final SqlColumn<String> id = column("id", JDBCType.VARCHAR);

        public final SqlColumn<String> courseid = column("courseid", JDBCType.VARCHAR);

        public final SqlColumn<String> studentid = column("studentid", JDBCType.VARCHAR);

        public final SqlColumn<Integer> studentscore = column("studentscore", JDBCType.INTEGER);

        public Score() {
            super("public.score");
        }
    }
}