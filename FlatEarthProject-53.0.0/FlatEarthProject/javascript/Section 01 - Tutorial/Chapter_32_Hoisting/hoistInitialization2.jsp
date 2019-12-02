<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hoist Initialization Not - 2</title>
</head>
<body>
	<p id="demo"></p>

	<script>
		var x = 5; // Initialize x
		var y; // Declare y

		elem = document.getElementById("demo"); // Find an element 
		elem.innerHTML = x + " " + y; // Display x and y

		y = 7; // Assign 7 to y
	</script>
</body>
</html>