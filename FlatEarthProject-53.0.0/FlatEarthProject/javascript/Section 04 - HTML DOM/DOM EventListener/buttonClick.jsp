<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Button Click</title>
</head>
<body>
	<p>This example uses the addEventListener() method to attach a
		click event to a button.</p>

	<button id="myBtn">Try it</button>

	<p id="demo"></p>

	<script>
		document.getElementById("myBtn").addEventListener("click", displayDate);

		function displayDate() {
			document.getElementById("demo").innerHTML = Date();
		}
	</script>
</body>
</html>