<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Undefined and Null</title>
</head>
<body>
	<p>
		The value of a variable with no value is <b>undefined</b>.
	</p>
	<p>
		Variables can be emptied by setting the value to <b>null</b>.
	</p>

	<p id="demo"></p>

	<script>
		var person;
		var car = "Volvo";
		var x = null;
		document.getElementById("demo").innerHTML = person + "<br>" + car
				+ "<br>" + x;
	</script>
</body>
</html>