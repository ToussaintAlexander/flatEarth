<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Index Number</title>
</head>
<body>
	<p>Array elements are accessed using their index number.</p>

	<button onclick="myFunction()">Try it</button>

	<p id="demo"></p>

	<script>
		var fruits = [ "Banana", "Orange", "Apple", "Mango" ];
		document.getElementById("demo").innerHTML = fruits;

		function myFunction() {
			fruits[0] = "Kiwi";
			document.getElementById("demo").innerHTML = fruits;
		}
	</script>
</body>
</html>