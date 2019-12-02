<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>While Loop</title>
</head>
<body>
	<p>Click the button to loop through a block of as long as i is less
		than 10.</p>

	<button onclick="myFunction()">Try it</button>

	<p id="demo"></p>

	<script>
		function myFunction() {
			var text = "";
			var i = 0;
			while (i < 10) {
				text += "<br>The number is " + i;
				i++;
			}
			document.getElementById("demo").innerHTML = text;
		}
	</script>

</body>
</html>