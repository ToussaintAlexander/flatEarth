<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Change HTML Style</title>
</head>
<body>
	<p id="p1">Hello World!</p>
	<p id="p2">Hello World!</p>

	<script>
		document.getElementById("p2").style.color = "blue";
		document.getElementById("p2").style.fontFamily = "Arial";
		document.getElementById("p2").style.fontSize = "larger";
	</script>

	<p>The paragraph above was changed by a script.</p>
</body>
</html>