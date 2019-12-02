<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Splice Method</title>
</head>
<body>
	<p>The splice() method adds new elements to an array.</p>

	<button onclick="myFunction()">Try it</button>

	<p id="demo"></p>

	<script>
		var fruits = [ "Banana", "Orange", "Apple", "Mango" ];
		document.getElementById("demo").innerHTML = fruits;
		function myFunction() {
			fruits.splice(2, 0, "Lemon", "Kiwi");
			document.getElementById("demo").innerHTML = fruits;
		}
	</script>
</body>
</html>