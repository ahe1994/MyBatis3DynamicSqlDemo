// ==========================
// Copyright (c) 2021-09-17, Hyva Holding B.V.
// All rights reserved.
// ==========================
package com.example.mybatisdynamicsqldemo.model;

import lombok.Data;

@Data
public class ScoreDTO {

  private String id;
  private String courseId;
  private String courseName;
  private String studentId;
  private String studentName;
  private Integer studentScore;

}
