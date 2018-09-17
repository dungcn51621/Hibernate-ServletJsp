<%@ page language="java" contentType="text/html;charset=UTF-8" %>
<%@ page import="model.EmployeeBean"%>

<html>

<head>
	<title>Demo Use Bean</title>
</head>

<body>

	<jsp:useBean id="sampleBean" class="model.EmployeeBean">
	    <%-- intialize bean properties --%>
	    <jsp:setProperty name="sampleBean" property="name" value="Name1" />
	    <jsp:setProperty name="sampleBean" property="age" value="16" />
	</jsp:useBean>
	
	Name: <jsp:getProperty name="sampleBean" property="name" /><br>
	Age: <jsp:getProperty name="sampleBean" property="age" />

</body>