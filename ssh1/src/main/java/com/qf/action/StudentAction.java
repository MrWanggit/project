package com.qf.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qf.pojo.Student;
import com.qf.service.StudentService;

@Controller
public class StudentAction {
	
	@Autowired
	@Qualifier("studentService")
	private StudentService studentService;

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

	@RequestMapping("addStudent.do")
	public String add(HttpServletRequest request, HttpServletResponse response) {
		int id = Integer.parseInt(request.getParameter("sid"));
		String sname = request.getParameter("sname");
		String sdesc = request.getParameter("sdesc");
		System.out.println(id);
		System.out.println(sname);
		System.out.println(sdesc);
		Student student = new Student(sname, sdesc);
		studentService.addStudent(student);
		
		return "redirect:/login.jsp";
	}
	
	@RequestMapping("login.do")
	public String find(HttpServletRequest request, HttpServletResponse response) {
		int id = Integer.parseInt(request.getParameter("sid"));
		String sname = request.getParameter("sname");
		
		System.out.println(id);
		System.out.println(sname);
		Student student = studentService.findStudent(id);
		request.getSession().setAttribute("stu", student);
		return "redirect:/loginSuccess.jsp";
	}
	
	@RequestMapping("update.do")
	public String update(HttpServletRequest request, HttpServletResponse response) {
		int id = Integer.parseInt(request.getParameter("sid"));
		String sdesc = request.getParameter("sdesc");
		
		System.out.println(id);
		System.out.println(sdesc);
		studentService.updateStudent(id, sdesc);
		return "redirect:/login.jsp";
	}
	
	@RequestMapping("del.do")
	public String del(HttpServletRequest request, HttpServletResponse response) {
		int id = Integer.parseInt(request.getParameter("sid"));
		
		System.out.println(id);
		studentService.delStudent(id);
		return "redirect:/login.jsp";
	}
	@RequestMapping("findAllStudents.do")
	public String findAllStudents(HttpServletRequest request, HttpServletResponse response) {
		
		
		List<Student> list = studentService.findAllStudents();
		request.getSession().setAttribute("list", list);
		return "redirect:/findAllStudents.jsp";
	}

}
