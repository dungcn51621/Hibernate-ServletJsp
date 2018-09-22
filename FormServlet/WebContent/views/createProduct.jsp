<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
.error {
	color:red;
}
</style>
</head>
<body>
	<form action="formdemo" method="POST">
		<p>
			Name: <input name="name" /></br>
			<label class="error">${nameError}</label>
		</p>
		
		
		<p>
			Description: <textarea name="description"></textarea></br>
			<label class="error">${descError}</label>
		</p>
		<p>
			Image: <input name="image" type="file"/></br>
			<label class="error">${imageError}</label>
		</p>
		<p>
			<input type="submit"/>
		</p>	
	</form>

</body>
</html>