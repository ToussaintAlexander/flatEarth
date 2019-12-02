<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hexadecimal</title>
</head>
<body>
	<p>Numeric constants, preceded by 0x, are interpreted as
		hexadecimal.</p>

	<button onclick="myFunction()">Try it</button>

	<p id="demo"></p>

	<script>
		function myFunction() {
			document.getElementById("demo").innerHTML = "0xFF = " + 0xFF;
		}
	</script>
</body>
</html>