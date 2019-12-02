<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Infinity Method</title>
</head>
<body>
	<p>Infinity is returned if you calculate a number outside the
		largest possible number.</p>

	<button onclick="myFunction()">Try it</button>

	<p id="demo"></p>

	<script>
		function myFunction() {
			var myNumber = 2;
			var txt = "";
			while (myNumber != Infinity) {
				myNumber = myNumber * myNumber;
				txt = txt + myNumber + "<br>";
			}
			document.getElementById("demo").innerHTML = txt;
		}
	</script>

</body>
</html>