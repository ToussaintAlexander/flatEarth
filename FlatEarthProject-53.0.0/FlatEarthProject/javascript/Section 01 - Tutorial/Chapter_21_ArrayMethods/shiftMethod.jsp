<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Shift Method</title>
</head>
<body>
	<p>The shift method removes (shifts) the first element of an array.</p>

	<button onclick="myFunction()">Try it</button>

	<p id="demo"></p>

	<script>
		var fruits = [ "Banana", "Orange", "Apple", "Mango" ];
		document.getElementById("demo").innerHTML = fruits;

		function myFunction() {
			fruits.shift();
			document.getElementById("demo").innerHTML = fruits;
		}
	</script>
</body>
</html>