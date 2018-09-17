<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		out.print("Hello Dymanamic web"); //out.print - JSPWriter
		out.print("out.print -> JSPWriter");
	%>
	<ul>
		<li><a href="${pageContext.request.contextPath}/hello">Hello Servlet</a></li>
		<li><a href="${pageContext.request.contextPath}/date">Show date</a></li>
		<li><a href="#"></a></li>
	</ul>
</body>
</html>