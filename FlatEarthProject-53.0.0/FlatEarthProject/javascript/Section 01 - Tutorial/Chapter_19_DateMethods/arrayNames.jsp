<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Array Names</title>
</head>
<body>
	<p>You can use an array to display the name of the weekday:</p>

	<p id="demo"></p>

	<script>
		var d = new Date();
		var days = [ "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday",
				"Friday", "Saturday" ];
		document.getElementById("demo").innerHTML = days[d.getDay()];
	</script>
</body>
</html>