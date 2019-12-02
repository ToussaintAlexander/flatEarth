<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>OnChange Event</title>

<script>
	function myFunction() {
		var x = document.getElementById("fname");
		x.value = x.value.toUpperCase();
	}
</script>

</head>
<body>
	Enter your name:
	<input type="text" id="fname" onchange="myFunction()">
	<p>When you leave the input field, a function is triggered which
		transforms the input text to upper case.</p>
</body>
</html>