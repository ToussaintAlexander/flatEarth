<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Different Types</title>
</head>
<body>
	<p>This example uses the addEventListener() method to add many
		events on the same button.</p>

	<button id="myBtn">Try it</button>

	<p id="demo"></p>

	<script>
		var x = document.getElementById("myBtn");
		x.addEventListener("mouseover", myFunction);
		x.addEventListener("click", mySecondFunction);
		x.addEventListener("mouseout", myThirdFunction);

		function myFunction() {
			document.getElementById("demo").innerHTML += "Moused over!<br>"
		}

		function mySecondFunction() {
			document.getElementById("demo").innerHTML += "Clicked!<br>"
		}

		function myThirdFunction() {
			document.getElementById("demo").innerHTML += "Moused out!<br>"
		}
	</script>
</body>
</html>