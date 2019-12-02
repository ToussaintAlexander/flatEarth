<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Objects are Mutable</title>
</head>
<body>
	<p id="demo"></p>

	<script>
		var person = {
			firstName : "John",
			lastName : "Doe",
			age : 50,
			eyeColor : "blue"
		}
		var x = person
		x.age = 10;
		document.getElementById("demo").innerHTML = person.firstName + " is "
				+ person.age + " years old.";
	</script>
</body>
</html>