package com.qf.fm;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestFM {

    public static void main(String[] args) throws Exception {
//        test1_map();
        test2_pojo();
    }

    private static void test1_map() throws IOException, TemplateException {
        Configuration configuration = new Configuration(Configuration.getVersion());
        configuration.setDirectoryForTemplateLoading(new File("D:/ftl"));
        //设置编码
        configuration.setDefaultEncoding("UTF-8");
        //创建模板对象
        Template template = configuration.getTemplate("hello.ftl");
        //创建一个模板使用的数据集
        Map<String, String> map = new HashMap<String, String>();
        map.put("title", "习大大的十九大");
        map.put("content", "真不错");
        map.put("time", "2018-01-31");
        template.process(map, new FileWriter("d:/hello.html"));
    }

    private static void test2_pojo() throws IOException, TemplateException {
        Configuration configuration = new Configuration(Configuration.getVersion());
        configuration.setDirectoryForTemplateLoading(new File("D:/ftl"));
        //设置编码
        configuration.setDefaultEncoding("UTF-8");
        //创建模板对象
        Template template = configuration.getTemplate("student.ftl");
        //创建一个模板使用的数据集
        List<Student> list = new ArrayList<Student>();
        Student student = new Student();
        student.setId(123);
        student.setAge(23);
        student.setName("王亚磊");
        Student student1 = new Student();
        student1.setId(124);
        student1.setAge(24);
        student1.setName("王亚磊1");
        list.add(student);
        list.add(student1);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("studentList", list);
        template.process(map, new FileWriter("D:/ftl/student.html"));
    }

}
