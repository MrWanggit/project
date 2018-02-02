package com.qf.service;

import java.util.List;

import com.qf.pojo.Student;

public interface StudentService {

	void addStudent(Student student);

	void delStudent(int id);

	void updateStudent(int id, String sdesc);

	Student findStudent(int id);
	
	List<Student> findAllStudents();

}
