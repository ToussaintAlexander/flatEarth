<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Different Value</title>
</head>
<body>
	<p id="demo"></p>

	<script>
		cars = [ "BMW", "Volvo", "Saab", "Ford" ];
		text = "";
		var i;
		for (var i = 0; i < cars.length; i++) {
			text += cars[i] + "<br>";
		}

		document.getElementById("demo").innerHTML = text;
	</script>
</body>
</html>