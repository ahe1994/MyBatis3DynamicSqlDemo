// ==========================
// Copyright (c) 2021-09-16, Hyva Holding B.V.
// All rights reserved.
// ==========================
package com.example.mybatisdynamicsqldemo.uitl;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

public class MybatisGenerator {

  public static void main(String[] args) throws Exception{
    String classpath = MybatisGenerator.class.getResource("/").getPath();
    String filename = "generatorConfig.xml";
    File file = new File(classpath + filename);
    if(!file.exists()){
      //找不到文件 切换路径
      classpath = classpath.replace("classes", "resources");
      file = new File(classpath + filename);
    }
    List<String> warnings = new ArrayList<>();
    ConfigurationParser cp = new ConfigurationParser(warnings);
    Configuration config = cp.parseConfiguration(file);
    DefaultShellCallback callback = new DefaultShellCallback(true);
    MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
    myBatisGenerator.generate(null);
  }

}
