<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Person 3 Object</title>
</head>
<body>
	<p>Creating and using an object method:</p>

	<p id="demo"></p>

	<script>
		var person = {
			firstName : "John",
			lastName : "Doe",
			id : 5566,
			fullName : function() {
				return this.firstName + " " + this.lastName
			}
		};

		document.getElementById("demo").innerHTML = person.fullName();
	</script>
</body>
</html>