<%@page import="model.Product"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>Name</th>
				<th>Description</th>
				<th>Image</th>
			</tr>
		</thead>
		
		<tbody>
			
<%-- 				<% --%>
<!-- // 					Product newProduct = (Product) request.getAttribute("productList"); -->
<!-- // 					out.print("<td>" + newProduct.getName() + "</td>"); -->
<!-- // 				    out.print("<td>" + newProduct.getDescription() + "</td>"); -->
<!-- // 				    out.print("<td>" + newProduct.getImage() + "</td>"); -->
<%-- 				%> --%>
				
<%-- 	C1.			<td>${newProduct.name}</td> --%>
<%-- 				<td>${newProduct.description}</td> --%>
<%-- 				<td>${newProduct.image}</td> --%>

			<c:forEach var="item" items="${productList}" varStatus="status">
			    <tr>
					<td>${status.count}.${item.name}</td>
					<td>${status.count}.${item.description}</td>
					<td>${status.count}.${item.image}</td>
				</tr>
			</c:forEach>
			
		</tbody>
	
	</table>
</body>
</html>