<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Continue Statement</title>
</head>
<body>
	<p>Click the button to do a loop which will skip the step where i =
		3.</p>

	<button onclick="myFunction()">Try it</button>

	<p id="demo"></p>

	<script>
		function myFunction() {
			var text = "";
			var i;
			for (i = 0; i < 10; i++) {
				if (i == 3)
					continue;
				text += "The number is " + i + "<br>";
			}
			document.getElementById("demo").innerHTML = text;
		}
	</script>
</body>
</html>