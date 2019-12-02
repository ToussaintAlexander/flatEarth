<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>toString Method</title>
</head>
<body>
	<p>The toString() method can output numbers as base 16 (hex), base
		8 (octal), or base 2 (binary).</p>

	<p id="demo"></p>

	<button onclick="myFunction()">Try it</button>

	<script>
		function myFunction() {
			var myNumber = 128;
			document.getElementById("demo").innerHTML = "128 = " + myNumber
					+ " Decimal, " + myNumber.toString(16) + " Hexadecimal, "
					+ myNumber.toString(8) + " Octal, " + myNumber.toString(2)
					+ " Binary."
		}
	</script>
</body>
</html>