<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Automatic Variable</title>
</head>
<body>
	<p>If you assign a value to a variable that has not been declared,
		it will automatically become a GLOBAL variable:</p>

	<p id="demo"></p>

	<script>
		myFunction();
		document.getElementById("demo").innerHTML = "I can display " + carName;

		function myFunction() {
			carName = "Volvo";
		}
	</script>
</body>
</html>