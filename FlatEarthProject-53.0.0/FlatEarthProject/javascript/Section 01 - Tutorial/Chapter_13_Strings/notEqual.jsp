<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Not Equal</title>
</head>
<body>
	<p id="demo"></p>

	<script>
		var x = "John"; // x is a string
		var y = new String("John"); // y is an object
		document.getElementById("demo").innerHTML = x === y;
	</script>
</body>
</html>