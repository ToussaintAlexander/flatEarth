<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>External Function</title>
</head>
<body>
	<p>This example uses the addEventListener() method to execute a
		function when a user clicks on a button.</p>

	<button id="myBtn">Try it</button>

	<script>
		document.getElementById("myBtn").addEventListener("click", myFunction);

		function myFunction() {
			alert("Hello World!");
		}
	</script>
</body>
</html>