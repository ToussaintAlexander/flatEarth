<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Real is True</title>
</head>
<body>
	<p id="demo"></p>


	<script>
		var b1 = Boolean(100);
		var b2 = Boolean(3.14);
		var b3 = Boolean(-15);
		var b4 = Boolean("Hello");
		var b5 = Boolean('false');
		var b6 = Boolean(1 + 7 + 3.14);

		document.getElementById("demo").innerHTML = "100 is " + b1 + "<br>"
				+ "3.14 is " + b2 + "<br>" + "-15 is " + b3 + "<br>"
				+ "Any (not empty) string is " + b4 + "<br>"
				+ "Even the string 'false' is " + b5 + "<br>"
				+ "Any expression is (exept zero) is " + b6;
	</script>
</body>
</html>