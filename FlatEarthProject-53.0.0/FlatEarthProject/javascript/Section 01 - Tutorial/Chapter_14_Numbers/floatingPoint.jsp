<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Floating Point</title>
</head>
<body>
	<p>Floating point arithmetic is not always 100% accurate.</p>

	<button onclick="myFunction()">Try it</button>

	<p id="demo"></p>

	<script>
		function myFunction() {
			x = 0.2 + 0.1;
			document.getElementById("demo").innerHTML = "0.2 + 0.1 = " + x;
		}
	</script>
</body>
</html>