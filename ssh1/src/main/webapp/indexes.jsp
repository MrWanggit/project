<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="${pageContext.request.contextPath }/login.jsp">登录</a>&nbsp;&nbsp;&nbsp;
	<a href="${pageContext.request.contextPath }/addStudent.jsp">注册</a><br/>
	<a href="${pageContext.request.contextPath }/updateStudent.jsp" >修改</a>
	&nbsp;&nbsp;&nbsp;
	<a href="${pageContext.request.contextPath }/delStudent.jsp">删除</a><br/>
	<a href="${pageContext.request.contextPath }/findAllStudents.do">查询所有</a>
</body>
</html>