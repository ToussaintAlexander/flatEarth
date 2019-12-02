<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Many Events</title>
</head>
<body>
	<p>This example uses the addEventListener() method to add two click
		events to the same button.</p>

	<button id="myBtn">Try it</button>

	<script>
		var x = document.getElementById("myBtn");
		x.addEventListener("click", myFunction);
		x.addEventListener("click", someOtherFunction);

		function myFunction() {
			alert("Hello World!")
		}

		function someOtherFunction() {
			alert("This function was also executed!")
		}
	</script>
</body>
</html>