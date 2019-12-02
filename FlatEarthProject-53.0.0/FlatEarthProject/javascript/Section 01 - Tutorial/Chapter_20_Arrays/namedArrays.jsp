<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Named Indexes</title>
</head>
<body>
	<p id="demo1"></p>
	<p id="demo2"></p>

	<script>
		var person = new Array();
		person["firstName"] = "John";
		person["lastName"] = "Doe";
		person["age"] = 46;
		document.getElementById("demo1").innerHTML = person["firstName"];
		document.getElementById("demo2").innerHTML = person[0];
	</script>
</body>
</html>