<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Global Variable</title>
</head>
<body>
	<p>A GLOBAL variable can be accessed from any script or function.</p>

	<p id="demo"></p>

	<script>
		var carName = "Volvo";
		myFunction();

		function myFunction() {
			document.getElementById("demo").innerHTML = "I can display " + carName;
		}
	</script>
</body>
</html>