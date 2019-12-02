<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New Keyword</title>
</head>
<body>
	<p id="demo"></p>

	<script>
		var person = new Object();
		person.firstName = "John";
		person.lastName = "Doe";
		person.age = 50;
		person.eyeColor = "blue";
		document.getElementById("demo").innerHTML = person.firstName + " is "
				+ person.age + " years old.";
	</script>
</body>
</html>