<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Reduce DOM Access</title>
</head>
<body>
	<p id="demo"></p>

	<script>
		var obj;
		obj = document.getElementById("demo");
		obj.innerHTML = " Hello";
	</script>
</body>
</html>