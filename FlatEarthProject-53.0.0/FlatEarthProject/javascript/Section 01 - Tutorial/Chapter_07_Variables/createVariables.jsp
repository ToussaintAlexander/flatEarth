<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Variables</title>
</head>
<body>
	<p>Create variables of different types:</p>

	<p id="demo"></p>

	<script>
		var pi = 3.14;
		var person = "John Doe";
		var answer = 'Yes I am!';

		document.getElementById("demo").innerHTML = pi;
		//document.getElementById("demo").innerHTML = person;
		//document.getElementById("demo").innerHTML = answer;
	</script>

	<p>Try to experiment with the // comments.</p>
</body>
</html>