<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Passing Parameters</title>
</head>
<body>
	<p>This example demonstrates how to pass parameter values when
		using the addEventListener() method.</p>

	<p>Click the button to perform a calculation.</p>

	<button id="myBtn">Try it</button>

	<p id="demo"></p>

	<script>
		var p1 = 5;
		var p2 = 7;

		document.getElementById("myBtn").addEventListener("click", function() {
			myFunction(p1, p2);
		});

		function myFunction(a, b) {
			var result = a * b;
			document.getElementById("demo").innerHTML = result;
		}
	</script>
</body>
</html>