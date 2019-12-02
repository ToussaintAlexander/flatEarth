<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Function as Expression</title>
</head>
<body>
	<p>Functions can be used in expressions.</p>
	<p id="demo"></p>

	<script>
		function myFunction(a, b) {
			return a * b;
		}
		var x = myFunction(4, 3) * 2;
		document.getElementById("demo").innerHTML = x;
	</script>
</body>
</html>