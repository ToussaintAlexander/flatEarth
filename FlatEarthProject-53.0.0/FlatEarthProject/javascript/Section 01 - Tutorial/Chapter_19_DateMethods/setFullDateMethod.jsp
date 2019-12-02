<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>setFullYear</title>
</head>
<body>
	<p>The setFullYear() method sets a date object to a special date.</p>

	<p>Remember that JavaScript counts months from 0 to 11. Month 10 is
		November.</p>

	<p id="demo"></p>

	<script>
		var d = new Date();
		d.setFullYear(2020, 0, 14);
		document.getElementById("demo").innerHTML = d;
	</script>
</body>
</html>