<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Declaration Hoisting</title>
</head>
<body>
	<p id="demo"></p>

	<script>
		x = 5; // Assign 5 to x

		elem = document.getElementById("demo"); // Find an element 
		elem.innerHTML = x; // Display x in the element

		var x; // Declare x
	</script>
</body>
</html>