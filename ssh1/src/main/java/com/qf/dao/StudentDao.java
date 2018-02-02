package com.qf.dao;

import java.util.List;

import com.qf.pojo.Student;

public interface StudentDao {
	
	void addStudent(Student student);
	
	void delStudent(int id);
	
	void updateStudent(int id,String sdesc);
	
	Student findStudent(int id);
	
	List<Student> findAllStudents();

}
