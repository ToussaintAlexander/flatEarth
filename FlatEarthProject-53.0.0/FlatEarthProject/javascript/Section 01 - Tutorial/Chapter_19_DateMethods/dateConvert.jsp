<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Date Conversion</title>
</head>
<body>
	<p>Date.parse(string) returns milliseconds.</p>
	<p>You can use the return value to convert the string to a date
		object:</p>

	<p id="demo"></p>

	<script>
		var msec = Date.parse("March 21, 2012");
		var d = new Date(msec);
		document.getElementById("demo").innerHTML = d;
	</script>
</body>
</html>