<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>As Variable</title>
</head>
<body>
	<p id="demo"></p>

	<script>
		document.getElementById("demo").innerHTML = "The temperature is " + toCelsius(40) + " Centigrade";

	function toCelsius(fahrenheit) {
��� 	return (5/9) * (fahrenheit-32);
	}; 
	</script>

</body>
</html>