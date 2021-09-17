package com.example.mybatisdynamicsqldemo.model;

import javax.annotation.Generated;

public class Score {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String courseid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String studentid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer studentscore;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getId() {
        return id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getCourseid() {
        return courseid;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCourseid(String courseid) {
        this.courseid = courseid == null ? null : courseid.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getStudentid() {
        return studentid;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setStudentid(String studentid) {
        this.studentid = studentid == null ? null : studentid.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getStudentscore() {
        return studentscore;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setStudentscore(Integer studentscore) {
        this.studentscore = studentscore;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Score other = (Score) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCourseid() == null ? other.getCourseid() == null : this.getCourseid().equals(other.getCourseid()))
            && (this.getStudentid() == null ? other.getStudentid() == null : this.getStudentid().equals(other.getStudentid()))
            && (this.getStudentscore() == null ? other.getStudentscore() == null : this.getStudentscore().equals(other.getStudentscore()));
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCourseid() == null) ? 0 : getCourseid().hashCode());
        result = prime * result + ((getStudentid() == null) ? 0 : getStudentid().hashCode());
        result = prime * result + ((getStudentscore() == null) ? 0 : getStudentscore().hashCode());
        return result;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", courseid=").append(courseid);
        sb.append(", studentid=").append(studentid);
        sb.append(", studentscore=").append(studentscore);
        sb.append("]");
        return sb.toString();
    }
}