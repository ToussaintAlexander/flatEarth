<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Exponent</title>
</head>
<body>
	<p id="demo"></p>

	<script>
		var x1 = 34.00;
		var x2 = 34;
		var y = 123e5;
		var z = 123e-5;

		document.getElementById("demo").innerHTML = x1 + "<br>" + x2 + "<br>"
				+ y + "<br>" + z
	</script>
</body>
</html>