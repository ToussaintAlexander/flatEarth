<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>TypeOf</title>
</head>
<body>
	<p>The typeof operator returns the type of a variable or an
		expression.</p>

	<button onclick="myFunction()">Try it</button>

	<p id="demo"></p>

	<script>
		function myFunction() {
			document.getElementById("demo").innerHTML = typeof "john" + "<br>"
					+ typeof 3.14 + "<br>" + typeof false + "<br>"
					+ typeof [ 1, 2, 3, 4 ] + "<br>" + typeof {
						name : 'john',
						age : 34
					};
		}
	</script>

</body>
</html>