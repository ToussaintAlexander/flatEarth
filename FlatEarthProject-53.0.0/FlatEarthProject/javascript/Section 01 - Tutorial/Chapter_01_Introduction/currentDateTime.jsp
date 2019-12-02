<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>My First JavaScript</h1>

	<p>Click Date to display current day, date, and time.</p>

	<button type="button" onclick="myFunction()">Date</button>

	<p id="demo"></p>

	<script>
		function myFunction() {
			document.getElementById("demo").innerHTML = Date();
		}
	</script>

</body>
</body>
</html>