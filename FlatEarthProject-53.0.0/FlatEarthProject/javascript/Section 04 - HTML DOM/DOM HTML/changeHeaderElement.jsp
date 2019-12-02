<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Change Header Element</title>
</head>
<body>
	<h1 id="header">Old Header</h1>

	<script>
		var element = document.getElementById("header");
		element.innerHTML = "New Header";
	</script>

	<p>"Old Header" was changed to "New Header"</p>
</body>
</html>