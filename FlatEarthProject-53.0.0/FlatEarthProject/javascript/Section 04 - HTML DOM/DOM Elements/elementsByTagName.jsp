<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Elements By Tag Name</title>
</head>
<body>
	<p>Hello World!</p>

	<div id="main">
		<p>The DOM is very useful.</p>
		<p>
			This example demonstrates the <b>getElementsByTagName</b> method
		</p>
	</div>

	<p id="demo"></p>

	<script>
		var x = document.getElementById("main");
		var y = x.getElementsByTagName("p");
		document.getElementById("demo").innerHTML = 'The first paragraph inside "main" is '
				+ y[0].innerHTML;
	</script>

</body>
</html>