<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>getTime Method</title>
</head>
<body>
	<p>The internal clock in JavaScript starts at midnight January 1,
		1970.</p>
	<p>The getTime() function returns the number of milliseconds since
		then:</p>

	<p id="demo"></p>

	<script>
		var d = new Date();
		document.getElementById("demo").innerHTML = d.getTime();
	</script>
</body>
</html>