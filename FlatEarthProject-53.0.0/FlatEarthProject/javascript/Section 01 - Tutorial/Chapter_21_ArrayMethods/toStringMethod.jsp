<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>toString Method</title>
</head>
<body>
	<p>The toString() method returns an array as a comma separated
		string.</p>

	<p id="demo"></p>

	<script>
		var fruits = [ "Banana", "Orange", "Apple", "Mango" ];
		document.getElementById("demo").innerHTML = fruits.toString();
	</script>
</body>
</html>