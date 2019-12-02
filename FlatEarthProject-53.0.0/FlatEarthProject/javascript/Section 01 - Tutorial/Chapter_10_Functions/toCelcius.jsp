<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Conversion</title>
</head>
<body>
	<p>This example calls a function to convert from Fahrenheit to Celcius:</p>
	<p id="demo"></p>

	<script>
		function toCelcius(f) {
			return (5 / 9) * (f - 32);
		}
		document.getElementById("demo").innerHTML = toCelcius(76);
	</script>
</body>
</html>