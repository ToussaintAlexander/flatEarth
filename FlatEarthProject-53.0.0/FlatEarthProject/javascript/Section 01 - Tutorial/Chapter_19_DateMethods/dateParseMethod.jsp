<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Date Parse</title>
</head>
<body>
	<p>Date.parse() returns the number of milliseconds between the date
		and January 1, 1970:</p>

	<p id="demo"></p>

	<script>
		var msec = Date.parse("March 21, 2012");
		document.getElementById("demo").innerHTML = msec;
	</script>
</body>
</html>