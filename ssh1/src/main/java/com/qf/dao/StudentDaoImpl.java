package com.qf.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.qf.pojo.Student;

public class StudentDaoImpl extends HibernateDaoSupport implements StudentDao {

	public void addStudent(Student student) {
		Serializable save = getHibernateTemplate().save(student);
		System.out.println();
		System.out.println();
		System.out.println();
	}

	public void delStudent(int id) {
		Student student = getHibernateTemplate().get(Student.class, id);
		getHibernateTemplate().delete(student);
	}

	public void updateStudent(int id, String sdesc) {
		Student student = getHibernateTemplate().get(Student.class, id);
		student.setSdesc(sdesc);
		getHibernateTemplate().update(student);
	}

	public Student findStudent(int id) {
		Student student = getHibernateTemplate().get(Student.class, id);
		return student;
	}

	public List<Student> findAllStudents() {
		List<Student> list = (List<Student>) getHibernateTemplate().find("from Student");
		return list;
	}

}
