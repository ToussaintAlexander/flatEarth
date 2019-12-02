<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Zero Division</title>
</head>
<body>
	<p>Division by zero also generates Infinity.</p>

	<button onclick="myFunction()">Try it</button>

	<p id="demo"></p>

	<script>
		function myFunction() {
			var x = 2 / 0;
			var y = -2 / 0;
			document.getElementById("demo").innerHTML = x + "<br>" + y;
		}
	</script>

</body>
</html>