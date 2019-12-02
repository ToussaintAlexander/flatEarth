<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>For In Loop</title>
</head>
<body>
	<p id="demo"></p>

	<script>
		var txt = "";
		var person = {
			fname : "John",
			lname : "Doe",
			age : 25
		};
		var x;
		for (x in person) {
			txt += person[x] + " ";
		}
		document.getElementById("demo").innerHTML = txt;
	</script>
</body>
</html>