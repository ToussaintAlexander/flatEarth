<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>My Web Page</h1>

	<p id="demo1"></p>
	<p id="demo2"></p>

	<script>
		a = 1;
		b = 2;
		c = a + b;
		document.getElementById("demo1").innerHTML = c;
		x = 1;
		y = 2;
		z = x + y;
		document.getElementById("demo2").innerHTML = z;
	</script>

</body>
</html>