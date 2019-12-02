<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Days to Date</title>
</head>
<body>
	<p>The setDate() method can be used to add days to a date.</p>

	<p id="demo"></p>

	<script>
		var d = new Date();
		d.setDate(d.getDate() + 50);
		document.getElementById("demo").innerHTML = d;
	</script>
</body>
</html>