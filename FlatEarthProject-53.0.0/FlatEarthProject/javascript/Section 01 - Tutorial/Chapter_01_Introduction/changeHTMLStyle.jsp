<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>My First JavaScript</h1>

	<p id="demo">JavaScript can change the style of an HTML element.</p>

	<script>
		function myFunction() {
			var x = document.getElementById("demo");
			x.style.fontSize = "25px";
			x.style.color = "red";
		}
	</script>

	<button type="button" onclick="myFunction()">Click Me!</button>

</body>
</html>