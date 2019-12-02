<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Local Variable</title>
</head>
<body>
	<p>A local variable can only be accessed from within the function
		where it was declared.</p>

	<p id="demo"></p>

	<script>
		myFunction();
		document.getElementById("demo").innerHTML = "I can display " + typeof carName;

		function myFunction() {
			var carName = "Volvo";
		}
	</script>
</body>
</html>