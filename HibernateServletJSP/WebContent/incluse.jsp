<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">


<title>Insert title here</title>

<style>
	*{
		padding: 0px;
		margin: 0px;
		box-sizing: border-box;
	}
	
	body{
		height: 1000px;
	}
	.footer, .header{
		background-color: olive;
		text-align: center;
		padding: 20px 20px;
	}
	
	.footer{
		position: fixed;
		bottom: 0;
		width: 100%;
	}
</style>
</head>
<body>
	<jsp:include page="/views/commons/header.jsp" />
	<jsp:include page="/views/commons/footer.jsp" />
</body>
</html>