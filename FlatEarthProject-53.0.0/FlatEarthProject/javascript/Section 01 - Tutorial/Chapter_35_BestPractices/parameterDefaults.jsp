<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Parameter Defaults</title>
</head>
<body>
	<p>Setting a default value to a function parameter.</p>
	<p id="demo"></p>

	<script>
		function myFunction(x, y) {
			y = y || 0;
			return x * y;
		}
		document.getElementById("demo").innerHTML = myFunction(4);
	</script>
</body>
</html>