<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>getFullYear Method</title>
</head>
<body>
	<p>The getFullYear() method returns the full year of a date:</p>

	<p id="demo"></p>

	<script>
		var d = new Date();
		document.getElementById("demo").innerHTML = d.getFullYear();
	</script>
</body>
</html>