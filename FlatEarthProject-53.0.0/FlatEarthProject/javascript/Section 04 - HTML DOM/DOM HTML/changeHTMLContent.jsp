<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Change HTML Content</title>
</head>
<body>
	<p id="p1">Hello World!</p>

	<script>
		document.getElementById("p1").innerHTML = "New text!";
	</script>

	<p>The paragraph above was changed by a script.</p>
</body>
</html>