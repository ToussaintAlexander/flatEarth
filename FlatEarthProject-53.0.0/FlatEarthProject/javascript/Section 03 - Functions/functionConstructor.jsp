<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Function Constructor</title>
</head>
<body>
	<p>JavaScrip has an built-in function constructor.</p>
	<p id="demo"></p>

	<script>
		var myFunction = new Function("a", "b", "return a * b");
		document.getElementById("demo").innerHTML = myFunction(4, 3);
	</script>
</body>
</html>