<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Accurate 15 Digits</title>
</head>
<body>
	<p>Integers are considered accurate up to 15 digits.</p>

	<button onclick="myFunction()">Try it</button>

	<p id="demo"></p>

	<script>
		function myFunction() {
			var x = 999999999999999;
			var y = 9999999999999999;
			document.getElementById("demo").innerHTML = x + "<br>" + y;
		}
	</script>
</body>
</html>