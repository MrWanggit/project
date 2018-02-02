package com.qf.service;

import java.util.List;

import com.qf.dao.StudentDao;
import com.qf.pojo.Student;

public class StudentServiceImpl implements StudentService {

	private StudentDao studentDao;

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	public void addStudent(Student student) {
		studentDao.addStudent(student);
	}

	public void delStudent(int id) {
		studentDao.delStudent(id);
	}

	public void updateStudent(int id, String sdesc) {
		studentDao.updateStudent(id, sdesc);
	}

	public Student findStudent(int id) {
		Student student = studentDao.findStudent(id);
		return student;
	}

	public List<Student> findAllStudents() {
		List<Student> list = studentDao.findAllStudents();
		return list;
	}

}
